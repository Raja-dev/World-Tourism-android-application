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

public class Brazil extends AppCompatActivity {
    GridView GV9;
    String arr9[]={"Cristo Redentor, Rio de Janeiro", "Amazon Rain Forests", "Iguazu Falls", "Fernando De Noronha"};
    int images9[]={R.drawable.christredeemer, R.drawable.amazonrainforests, R.drawable.iguacufalls, R.drawable.fernandodenoronha};
    String des8[]={"Christ the Redeemer, Portuguese Cristo Redentor, colossal statue of Jesus Christ at the summit of Mount Corcovado, Rio de Janeiro, southeastern Brazil. It was completed in 1931 and stands 98 feet (30 metres) tall, its horizontally outstretched arms spanning 92 feet (28 metres). The statue, made of reinforced concrete clad in a mosaic of thousands of triangular soapstone tiles, sits on a square stone pedestal base about 26 feet (8 metres) high, which itself is situated on a deck atop the mountain’s summit. The statue is the largest Art Deco-style sculpture in the world and is one of Rio de Janeiro’s most recognizable landmarks. In the 1850s the Vincentian priest Pedro Maria Boss suggested placing a Christian monument on Mount Corcovado to honour Isabel, princess regent of Brazil and the daughter of Emperor Pedro II, although the project was never approved. In 1921 the Roman Catholic archdiocese of Rio de Janeiro proposed that a statue of Christ be built on the 2,310-foot (704-metre) summit, which, because of its commanding height, would make it visible from anywhere in Rio. Citizens petitioned Pres. Epitácio Pessoa to allow the construction of the statue on Mount Corcovado."+
    "Rio de Janeiro, in full Cidade de São Sebastião do Rio de Janeiro, byname Rio, city and port, capital of the estado (state) of Rio de Janeiro, Brazil. It is located on the Atlantic Ocean, in the southeastern part of the tropical zone of South America, and is widely recognized as one of the world’s most beautiful and interesting urban centres. Although Rio de Janeiro continues to be the preeminent icon of Brazil in the eyes of many in the world, in reality its location, architecture, inhabitants, and lifestyle make it highly unique when compared with other Brazilian cities, especially the country’s capital of Brasília or the much larger city of São Paulo. The former is a much smaller city dating back only to the 1960s, while the latter is a huge, sprawling commercial and manufacturing centre with none of Rio’s spectacular natural beauty or captivating charm. Unlike Rio, both are located on flat interior plateaus. The name was given to the city’s original site by Portuguese navigators who arrived on January 1, 1502, and mistook the entrance of the bay for the mouth of a river (rio is the Portuguese word for “river” and janeiro the word for “January”). When the foundations of the future town were laid in 1565, it was named Cidade de São Sebastião do Rio de Janeiro (“City of St. Sebastian of Rio de Janeiro”) for both São Sebastião and Dom Sebastião, king of Portugal.",
    "The Amazon rainforest (Portuguese: Floresta Amazônica or Amazônia; Spanish: Selva Amazónica, Amazonía or usually Amazonia; French: Forêt amazonienne; Dutch: Amazoneregenwoud), also known in English as Amazonia or the Amazon Jungle, is a moist broadleaf forest in the Amazon biome that covers most of the Amazon basin of South America. This basin encompasses 7,000,000 km2 (2,700,000 sq mi), of which 5,500,000 km2 (2,100,000 sq mi) are covered by the rainforest. This region includes territory belonging to nine nations.\n" +
            "\n" +
            "The majority of the forest is contained within Brazil, with 60% of the rainforest, followed by Peru with 13%, Colombia with 10%, and with minor amounts in Venezuela, Ecuador, Bolivia, Guyana, Suriname and France (French Guiana). States or departments in four nations contain \"Amazonas\" in their names. The Amazon represents over half of the planet's remaining rainforests,[1] and comprises the largest and most biodiverse tract of tropical rainforest in the world, with an estimated 390 billion individual trees divided into 16,000 species.",
    "Iguazú Falls or Iguaçu Falls (Spanish: Cataratas del Iguazú [kataˈɾatas ðel iɣwaˈsu]; Guarani: Chororo Yguasu [ɕoɾoɾo ɨɣʷasu]; Portuguese: Cataratas do Iguaçu [kataˈɾatɐs du iɡwaˈsu]) are waterfalls of the Iguazu River on the border of the Argentine province of Misiones and the Brazilian state of Paraná. Together, they make up the largest waterfall system in the world.[2] The falls divide the river into the upper and lower Iguazu. The Iguazu River rises near the heart of the city of Curitiba. For most of its course, the river flows through Brazil; however, most of the falls are on the Argentine side. Below its confluence with the San Antonio River, the Iguazu River forms the boundary between Argentina and Brazil.\n" +
            "\n" +
            "The name \"Iguazú\" comes from the Guarani or Tupi words \"y\" [ɨ], meaning \"water\", and \"ûasú \"[waˈsu], meaning \"big\".[3] Legend has it that a deity planned to marry a beautiful woman named Naipí, who fled with her mortal lover Tarobá in a canoe. In a rage, the deity sliced the river, creating the waterfalls and condemning the lovers to an eternal fall.[3] The first European to record the existence of the falls was the Spanish Conquistador Álvar Núñez Cabeza de Vaca in 1541.",
    "Fernando de Noronha (Portuguese pronunciation: [feʁˈnɐ̃du d(ʒ)i noˈɾoɲɐ]) is an archipelago of 21 islands and islets in the Atlantic Ocean, 354 km (220 mi) offshore from the Brazilian coast. The archipelago's name is a corruption of the name of the Portuguese merchant Fernão de Loronha, to whom it was given by the Portuguese crown for services rendered regarding wood imported from Brazil. Only the homonymous main island is inhabited; it has an area of 18.4 km2 (7.1 sq mi) and a population estimated at 2,718 in 2012.[2] The archipelago's total area is 26 km2 (10 sq mi).\n" +
            "\n" +
            "The islands are administratively unique in Brazil. They form a \"state district\" (Portuguese: distrito estadual) that is not part of any municipality and is administered directly by the government of the state of Pernambuco (despite being closer to the state of Rio Grande do Norte).[3] The state district's jurisdiction also includes the very remote Saint Peter and Saint Paul Archipelago, located 625 kilometres (388 mi) northeast of Fernando de Noronha. 70% of the islands' area was established in 1988 as a national maritime park.\n" +
            "\n" +
            "In 2001, UNESCO designated it as a World Heritage Site because of the importance of its environment. Its time zone is UTC−02:00 all year round."};
    String view8[]={"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563391228995!6m8!1m7!1sCAoSLEFGMVFpcE9CbkpqdVAwSzNUUkJnSnZYTnpTZlJRTzhLWG51Z0JSMmFUMHh3!2m2!1d-22.95117405551539!2d-43.21001473814249!3f263.72225052744346!4f32.09304208521061!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563391387912!6m8!1m7!1sCAoSLEFGMVFpcE9mekVERzNCVVBxQ0xXeHZFOUswS2FlVndjMWgwMDVwVlBOWUZD!2m2!1d-2.442658557737207!2d-54.67561679462736!3f353.23003141781476!4f-12.18929481634261!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563391527163!6m8!1m7!1sCAoSLEFGMVFpcFB3Q0VONlpUWUtJRHFNRmhlckR0U0o1VGFRMV9yeFFSOXJQTGps!2m2!1d-25.695259!2d-54.4366662!3f54.357084934132345!4f-12.363220348238627!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563392045028!6m8!1m7!1sCAoSLEFGMVFpcE0tVU1ZZzU0c3VHN0h2VFdJNzdpalBYdTJ4NzB2bUsxUXhOOV81!2m2!1d-3.8447976!2d-32.4268917!3f246.15861832988628!4f-7.410579981922282!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV9=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV9.setAdapter(myAdapter2);
        GV9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                Intent brazil_details = new Intent(Brazil.this, Brazil_Details.class);
                brazil_details.putExtra("Name",arr9[position]);
                brazil_details.putExtra("Image",images9[position]);
                brazil_details.putExtra("Des",des8[position]);
                brazil_details.putExtra("View",view8[position]);
                startActivity(brazil_details);

            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr9.length;
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
            img2.setImageResource(images9[position]);
            text2.setText(arr9[position]);
            return convertview;
        }
    }
}