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

public class US extends AppCompatActivity {
    GridView GV6;
    String arr6[]={"Grand Canyon", "Niagara Falls", "Statue of Liberty", "Golden Gate Bridge"};
    int images6[]={R.drawable.grandcanyon, R.drawable.niagarafalls, R.drawable.statueofliberty, R.drawable.goldengatebridge};
    String des5[]={"The Grand Canyon (Hopi: Ongtupqa;[2] Yavapai: Wi:kaʼi:la, Navajo: Bidááʼ Haʼaztʼiʼ Tsékooh,[3][4] Spanish: Gran Cañón) is a steep-sided canyon carved by the Colorado River in Arizona, United States. The Grand Canyon is 277 miles (446 km) long, up to 18 miles (29 km) wide and attains a depth of over a mile (6,093 feet or 1,857 meters).[5]\n" +
            "\n" +
            "The canyon and adjacent rim are contained within Grand Canyon National Park, the Kaibab National Forest, Grand Canyon-Parashant National Monument, the Hualapai Indian Reservation, the Havasupai Indian Reservation and the Navajo Nation. President Theodore Roosevelt was a major proponent of preservation of the Grand Canyon area, and visited it on numerous occasions to hunt and enjoy the scenery.\n" +
            "\n" +
            "Nearly two billion years of Earth's geological history have been exposed as the Colorado River and its tributaries cut their channels through layer after layer of rock while the Colorado Plateau was uplifted.[6] While some aspects about the history of incision of the canyon are debated by geologists,[7] several recent studies support the hypothesis that the Colorado River established its course through the area about 5 to 6 million years ago.[1][8][9] Since that time, the Colorado River has driven the down-cutting of the tributaries and retreat of the cliffs, simultaneously deepening and widening the canyon.\n" +
            "\n" +
            "For thousands of years, the area has been continuously inhabited by Native Americans, who built settlements within the canyon and its many caves. The Pueblo people considered the Grand Canyon a holy site, and made pilgrimages to it.[10] The first European known to have viewed the Grand Canyon was García López de Cárdenas from Spain, who arrived in 1540.",
    "Niagara Falls is a group of three waterfalls at the southern end of Niagara Gorge, between the Canadian province of Ontario and the US state of New York. From largest to smallest, they are Horseshoe Falls (also known as Canadian Falls), American Falls and Bridal Veil Falls. Horseshoe Falls straddle the international border between Canada and the United States,[1] while American Falls and Bridal Veil Falls lie entirely within the United States. Bridal Veil Falls are separated from Horseshoe Falls by Goat Island and from American Falls by Luna Island.\n" +
            "\n" +
            "Located on the Niagara River, which drains Lake Erie into Lake Ontario, the combined falls have the highest flow rate of any waterfall in North America that has a vertical drop of more than 50 metres (160 ft). During peak daytime tourist hours, more than 168,000 m3 (six million cubic feet) of water goes over the crest of the falls every minute.[2] Horseshoe Falls is the most powerful waterfall in North America, as measured by flow rate.[3]\n" +
            "\n" +
            "The falls are 27 kilometres (17 mi) north-northwest of Buffalo, New York, and 121 kilometres (75 mi) south-southeast of Toronto, between the twin cities of Niagara Falls, Ontario, and Niagara Falls, New York. Niagara Falls was formed when glaciers receded at the end of the Wisconsin glaciation (the last ice age), and water from the newly formed Great Lakes carved a path through the Niagara Escarpment en route to the Atlantic Ocean.\n" +
            "\n" +
            "Niagara Falls is famed both for its beauty and as a valuable source of hydroelectric power. Balancing recreational, commercial, and industrial uses has been a challenge for the stewards of the falls since the 19th century.",
    "The Statue of Liberty (Liberty Enlightening the World; French: La Liberté éclairant le monde) is a colossal neoclassical sculpture on Liberty Island in New York Harbor in New York, in the United States. The copper statue, a gift from the people of France to the people of the United States, was designed by French sculptor Frédéric Auguste Bartholdi and its metal framework was built by Gustave Eiffel. The statue was dedicated on October 28, 1886.\n" +
            "\n" +
            "The Statue of Liberty is a figure of Libertas, a robed Roman liberty goddess. She holds a torch above her head with her right hand, and in her left hand carries a tabula ansata inscribed in Roman numerals with \"JULY IV MDCCLXXVI\" (July 4, 1776), the date of the U.S. Declaration of Independence. A broken shackle and chain lay at her feet as she walks forward, commemorating the recent national abolition of slavery.[7] The statue became an icon of freedom and of the United States, and a national park tourism destination. It is a welcoming sight to immigrants arriving from abroad.\n" +
            "\n" +
            "Bartholdi was inspired by a French law professor and politician, Édouard René de Laboulaye, who is said to have commented in 1865 that any monument raised to U.S. independence would properly be a joint project of the French and U.S. peoples. Because of the post-war instability in France, work on the statue did not commence until the early 1870s. In 1875, Laboulaye proposed that the French finance the statue and the U.S. provide the site and build the pedestal. Bartholdi completed the head and the torch-bearing arm before the statue was fully designed, and these pieces were exhibited for publicity at international expositions.\n" +
            "\n" +
            "The torch-bearing arm was displayed at the Centennial Exposition in Philadelphia in 1876, and in Madison Square Park in Manhattan from 1876 to 1882. Fundraising proved difficult, especially for the Americans, and by 1885 work on the pedestal was threatened by lack of funds. Publisher Joseph Pulitzer, of the New York World, started a drive for donations to finish the project and attracted more than 120,000 contributors, most of whom gave less than a dollar. The statue was built in France, shipped overseas in crates, and assembled on the completed pedestal on what was then called Bedloe's Island. The statue's completion was marked by New York's first ticker-tape parade and a dedication ceremony presided over by President Grover Cleveland.\n" +
            "\n" +
            "The statue was administered by the United States Lighthouse Board until 1901 and then by the Department of War; since 1933 it has been maintained by the National Park Service as part of the Statue of Liberty National Monument. Public access to the balcony around the torch has been barred since 1916.",
    "The Golden Gate Bridge is a suspension bridge spanning the Golden Gate, the one-mile-wide (1.6 km) strait connecting San Francisco Bay and the Pacific Ocean. The structure links the American city of San Francisco, California – the northern tip of the San Francisco Peninsula – to Marin County, carrying both U.S. Route 101 and California State Route 1 across the strait. The bridge is one of the most internationally recognized symbols of San Francisco, California, and the United States. It has been declared one of the Wonders of the Modern World by the American Society of Civil Engineers.[7]\n" +
            "\n" +
            "The Frommer's travel guide describes the Golden Gate Bridge as \"possibly the most beautiful, certainly the most photographed, bridge in the world\".[8][9] At the time of its opening in 1937, it was both the longest and the tallest suspension bridge in the world, with a main span of 4,200 feet (1,280 m) and a total height of 746 feet (227 m)."};
   String view5[]={"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563388497146!6m8!1m7!1sCAoSLEFGMVFpcFBoeTlqU0ljSXdUbVZHUkZQRWRsRE9oR0FQQ21zcHNTWTNycFhX!2m2!1d35.9420738!2d-111.6498337!3f47.92872566147949!4f-15.812024084038526!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563388709885!6m8!1m7!1sCAoSLEFGMVFpcFAteDNldjlLb0wyUG9tWGdhSmZqdHVsb01ZTDhSckR2c3FPbTBu!2m2!1d43.0895577!2d-79.0849436!3f15.346869640499648!4f-14.574797718298711!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563388821468!6m8!1m7!1s2CZFqal1cdPnc4zFkxbgcg!2m2!1d40.68895479195507!2d-74.04386646855232!3f304.64243!4f22.526375!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563389072767!6m8!1m7!1sCAoSLEFGMVFpcE1aS2RtUGtmNjlBb3NmUU5WZjdtaTZGMjA1NmVYVE1sMWxNakht!2m2!1d37.82731649999999!2d-122.4811066!3f54.609188881956!4f-5.48126250638488!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV6=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV6.setAdapter(myAdapter2);
        GV6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                Intent us_details = new Intent(US.this, US_Details.class);
                us_details.putExtra("Name",arr6[position]);
                us_details.putExtra("Image",images6[position]);
                us_details.putExtra("Des",des5[position]);
                us_details.putExtra("View",view5[position]);
                startActivity(us_details);

            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr6.length;
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
            img2.setImageResource(images6[position]);
            text2.setText(arr6[position]);
            return convertview;
        }
    }
}
