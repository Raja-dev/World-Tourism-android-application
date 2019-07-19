package com.example.worldfoodblogs;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class China extends AppCompatActivity {
    GridView GV7;
    String arr7[]={"The Great Wall China", "Forbidden City", " Xi'an — Terracotta Army ", "Chengdu — the City of Cute Giant Pandas "};
    int images7[]={R.drawable.greatwallchina, R.drawable.theforbiddencity, R.drawable.terracottaarmy, R.drawable.thecityofcutegianpandas};
    String des6[]={"The Great Wall of China (Chinese: 萬里長城; pinyin: Wànlǐ Chángchéng) is the collective name of a series of fortification systems generally built across the historical northern borders of China to protect and consolidate territories of Chinese states and empires against various nomadic groups of the steppe and their polities. Several walls were being built from as early as the 7th century BC by ancient Chinese states;[2] selective stretches were later joined together by Qin Shi Huang (220–206 BC), the first Emperor of China. Little of the Qin wall remains.[3] Later on, many successive dynasties have built and maintained multiple stretches of border walls. The most currently well-known of the walls were built by the Ming dynasty (1368–1644).\n" +
            "\n" +
            "Apart from defense, other purposes of the Great Wall have included border controls, allowing the imposition of duties on goods transported along the Silk Road, regulation or encouragement of trade and the control of immigration and emigration. Furthermore, the defensive characteristics of the Great Wall were enhanced by the construction of watch towers, troop barracks, garrison stations, signaling capabilities through the means of smoke or fire, and the fact that the path of the Great Wall also served as a transportation corridor.\n" +
            "\n" +
            "The frontier walls built by different dynasties have multiple courses. Collectively, they stretch from Liaodong in the east to Lop Lake in the west, from present-day Sino–Russian border in the north to Taohe River in the south; along an arc that roughly delineates the edge of Mongolian steppe. A comprehensive archaeological survey, using advanced technologies, has concluded that the walls built by the Ming dynasty measure 8,850 km (5,500 mi).[4] This is made up of 6,259 km (3,889 mi) sections of actual wall, 359 km (223 mi) of trenches and 2,232 km (1,387 mi) of natural defensive barriers such as hills and rivers.[4] Another archaeological survey found that the entire wall with all of its branches measures out to be 21,196 km (13,171 mi).[5] Today, the defensive system of Great Wall is generally recognized as one of the most impressive architectural feats in history.",
    "The Forbidden City (Chinese: 故宫; pinyin: Gùgōng) is a palace complex in central Beijing, China. It houses the Palace Museum, and was the former Chinese imperial palace from the Ming dynasty to the end of the Qing dynasty (the years 1420 to 1912). The Forbidden City served as the home of emperors and their households as well as the ceremonial and political center of Chinese government for almost 500 years.\n" +
            "\n" +
            "Constructed from 1406 to 1420, the complex consists of 980 buildings[3] and covers 72 hectares (over 180 acres).[4][5] The palace exemplifies traditional Chinese palatial architecture,[6] and has influenced cultural and architectural developments in East Asia and elsewhere. The Forbidden City was declared a World Heritage Site in 1987,[6] and is listed by UNESCO as the largest collection of preserved ancient wooden structures in the world.\n" +
            "\n" +
            "Since 1925, the Forbidden City has been under the charge of the Palace Museum, whose extensive collection of artwork and artifacts were built upon the imperial collections of the Ming and Qing dynasties. Part of the museum's former collection is now in the National Palace Museum in Taipei. Both museums descend from the same institution, but were split after the Chinese Civil War. Since 2012, the Forbidden City has seen an average of 15 million visitors annually, and received more than 16 million visitors in 2016[7] and 2017.",
    "The Terracotta Army is a collection of terracotta sculptures depicting the armies of Qin Shi Huang, the first Emperor of China. It is a form of funerary art buried with the emperor in 210–209 BCE with the purpose of protecting the emperor in his afterlife.\n" +
            "\n" +
            "The figures, dating from approximately the late third century BCE,[1] were discovered in 1974 by local farmers in Lintong County, outside Xi'an, Shaanxi, China. The figures vary in height according to their roles, with the tallest being the generals. The figures include warriors, chariots and horses. Estimates from 2007 were that the three pits containing the Terracotta Army held more than 8,000 soldiers, 130 chariots with 520 horses, and 150 cavalry horses, the majority of which remained buried in the pits near Qin Shi Huang's mausoleum.[2] Other terracotta non-military figures were found in other pits, including officials, acrobats, strongmen, and musicians.",
    "Chengdu is now one of the most important economic, financial, commercial, cultural, transportation, and communication centers in Western China. Its economy is diverse, characterized by the machinery, automobile, medicine, food, and information technology industries. Chengdu Shuangliu International Airport, a hub of Air China and Sichuan Airlines, is one of the 30 busiest airports in the world, and the Chengdu railway station is one of the six biggest in China. It is associated with the giant panda, a Chinese national symbol, which inhabits the area of Sichuan; the city is home to the Chengdu Research Base of Giant Panda Breeding.\n" +
            "\n" +
            "Contents. Seeing the pandas in Chengdu is as popular as visiting the Great Wall of China in Beijing or the Terracotta Army in Xian. As soon as you arrive in the city you know you have hit the land of panda madness. Their adorable faces greet you from every street corner, appear in all manner of advertisements and are even used to decorate taxi car bonnets. Random Chengdu panda-themed goods are sold at every street market and an official panda merchandise store even exists within the city’s main shopping streets, including the Big and Small Alley and the Jinli night fair."};
    String view6[]={"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563389511331!6m8!1m7!1sCAoSLEFGMVFpcFB1VTB1TGxKc2pQaWdLT05GaGxGNFBLWDV3Um15dXR5MDl2YmRp!2m2!1d40.431997711109!2d116.57041900386!3f158.33528!4f0!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563389641793!6m8!1m7!1sCAoSLEFGMVFpcFA2RFZUQW1tTFk3R2g4UTV3bW1NOFRzQkRRYmprNVB4SldJS1NU!2m2!1d39.9113562!2d116.3912237!3f357.46777!4f19.150054999999995!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563389802863!6m8!1m7!1sCAoSLEFGMVFpcE1MY2ppYjdfRFVDMHhQOVFVWDVFMFFaRkNma0UyTWotVmZ4QVBs!2m2!1d34.38520477566578!2d109.2740881070495!3f240.60263551881!4f19.05958944783768!5f0.7820865974627469\" width=\"800\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563390072560!6m8!1m7!1sLALkXsCGBjYAAAQIt72jdQ!2m2!1d30.74094128836372!2d104.1392258703659!3f312.0361022949219!4f0!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV7=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV7.setAdapter(myAdapter2);
        GV7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                Intent china_details = new Intent(China.this, China_Details.class);
                china_details.putExtra("Name",arr7[position]);
                china_details.putExtra("Image",images7[position]);
                china_details.putExtra("Des",des6[position]);
                china_details.putExtra("View",view6[position]);
                startActivity(china_details);


            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr7.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup viewGroup) {

            LayoutInflater inflater= getLayoutInflater();
            convertview=inflater.inflate(R.layout.grid_content2, null);
            ImageView img2 = (ImageView)convertview.findViewById(R.id.img_2);
            TextView text2 = (TextView)convertview.findViewById(R.id.text_2);
            img2.setImageResource(images7[position]);
            text2.setText(arr7[position]);
            return convertview;
        }
    }
}