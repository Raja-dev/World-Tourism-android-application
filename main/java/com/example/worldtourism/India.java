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

public class India extends AppCompatActivity {
    GridView GV2;
    String arr2[]={"Victoria Memorial (KOLKATA)", "Taj Mahal (AGRA)", "Manali", "Andaman & Nicobar Island"};
    int images2[]={R.drawable.victoriamemorial, R.drawable.tajmahal, R.drawable.manali, R.drawable.andamannicobar};
   String des[]={"The Victoria Memorial is a large marble building in Kolkata, West Bengal," +
            " India, which was built between 1906 and 1921. It is dedicated to the memory of " +
            "Queen Victoria (1819–1901) and is now a museum and tourist destination under the " +
            "auspices of the Ministry of Culture.[2] The memorial lies on the Maidan (grounds) by" +
            " the bank of the Hooghly River, near Jawaharlal Nehru Road (better known as Chowringhee Road)." +
            "[3] Every year thousands of people come to visit this museum.",
            "The Taj Mahal (/ˌtɑːdʒ məˈhɑːl, ˌtɑːʒ-/;[4] Arabic or Perso-Arabic: تاج محل [lit. " +
                    "\"Place or Position of the Crown\"], Hindi: ताज महल [taːdʒ ˈmɛːɦ(ə)l], meaning \"Crown of" +
                    " the Palaces\")[5] is an ivory-white marble mausoleum on the south bank of the Yamuna river in the" +
                    " Indian city of Agra. It was commissioned in 1632 by the Mughal emperor, Shah Jahan (reigned from 1628 to 1658)," +
                    " to house the tomb of his favourite wife, Mumtaz Mahal. It also houses the tomb of Shah Jahan, the builder." +
                    " The tomb is the centerpiece of a 17-hectare (42-acre) complex, which includes a mosque and a guest house," +
                    " and is set in formal gardens bounded on three sides by a crenellated wall.",
            "Manali is a resort town nestled in the mountains of the Indian state of Himachal Pradesh near the northern " +
                    "end of the Kullu Valley in the Beas River Valley. It is located in the Kullu district," +
                    " about 270 km (168 mi) north of the state capital, Shimla, 309 km (192 miles) north east of" +
                    " Chandigarh and 544 km (338 miles) northeast of Delhi, the national capital. The small town, with" +
                    " a population of 8,096,[1] is the beginning of an ancient trade route to Ladakh and from there " +
                    "over the Karakoram Pass on to Yarkand and Khotan in the Tarim Basin. It is a popular tourist destination " +
                    "and serves as the gateway to Lahaul and Spiti district as well as Leh.",
            "The Andaman and Nicobar Islands, one of the seven union territories of India comprising 572 islands of which 37 are inhabited, are a group of islands at the juncture of the Bay of Bengal and Andaman Sea.[5]\n" +
                    "\n" +
                    "The territory is about 150 km (93 mi) north of Aceh in Indonesia and separated from Thailand a" +
                    "nd Myanmar by the Andaman Sea. It comprises two island groups, the Andaman Islands (partly) and " +
                    "the Nicobar Islands, separated by the 150 km wide Ten Degree Channel (on the 10°N parallel), " +
                    "with the Andamans to the north of this latitude, and the Nicobars to the south (or by 179 km)." +
                    " The Andaman Sea lies to the east and the Bay of Bengal to the west."};
   String View[]= {"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563380356943!6m8!1m7!1ssaR3roR-in-rHkWcJHq9aA!2m2!1d22.54390153658023!2d88.34209902273892!3f21.26672281916572!4f6.936402638560111!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563381524164!6m8!1m7!1svQAmRxAVGgXXQmPcT8d0cQ!2m2!1d27.17376226664116!2d78.04199578168942!3f2.8378293622371413!4f6.240594585525287!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563382445291!6m8!1m7!1sCAoSLEFGMVFpcFBuLVBYSk9RakFZblNETWZCQ0k0OXpqbXhMalZkQ0RpZ192TFlG!2m2!1d32.242728!2d77.19135949999999!3f307.29925299123687!4f-12.137603533288129!5f0.7820865974627469\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563382698696!6m8!1m7!1sCAoSLEFGMVFpcE45elpuUmdzcTI1N2tDVEEyUUM0dHVHU1FNcXFjVXRXajIzWTJO!2m2!1d11.8321025!2d93.0140303!3f175.36270006894907!4f-4.479881260202077!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV2=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV2.setAdapter(myAdapter2);
        GV2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {

                Intent india_details = new Intent(India.this, India_Details.class);
                india_details.putExtra("Name",arr2[position]);
                india_details.putExtra("Image",images2[position]);
                india_details.putExtra("Des",des[position]);
                india_details.putExtra("View",View[position]);
                startActivity(india_details);
            }
        });

    }
    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr2.length;
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
            img2.setImageResource(images2[position]);
            text2.setText(arr2[position]);

            return convertview;
        }
    }
}