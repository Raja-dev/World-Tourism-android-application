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

public class France extends AppCompatActivity {
    GridView GV3;
    String arr3[]={"Eiffel Tower", "Louvre Museum", "Disneyland", "French Riviera"};
    int images3[]={R.drawable.eiffeltower, R.drawable.louvremuseum, R.drawable.disneyland, R.drawable.frenchriviera};
    String des2[] = {"The Eiffel Tower is a famous landmark in Paris. It is the symbol of Paris. It was built between 1887 and 1889, for the 100th year of the French Revolution. The Eiffel Tower was the entrance arch for a fair called the Exposition Universelle .Also it was named after Gustave Eiffel. The Eiffel Tower is the most visited monument in the world .\n" +
            "\n" +
            "It cost £35 million to build. It is 300 metres tall, but this height does not include the 24 m aerial (antenna) on the top; the total height of the structure is 324 m (1058 feet).the same height as a 81 storey building . There are also 1,665 steps inside the Eiffel Tower. It weighs 10,000 tons. It consists of 18,038 pieces and 2 1/2 million rivets. There are 20,000 sparkling lights and 80 kilometers of cables covering the structure. The weight of paint used is 60 tons, and the surface to be painted - 250,000 m2. Three separate colors of paint are used on the Tower in order to enhance the impression of height, with the darkest on the bottom and the lightest at the top.",
    "The Louvre (US: /ˈluːv(rə)/),[2] or the Louvre Museum (French: Musée du Louvre [myze dy luvʁ] (About this soundlisten)), is the world's largest art museum and a historic monument in Paris, France. A central landmark of the city, it is located on the Right Bank of the Seine in the city's 1st arrondissement (district or ward). Approximately 38,000 objects from prehistory to the 21st century are exhibited over an area of 72,735 square metres (782,910 square feet).[3] In 2018, the Louvre was the world's most visited art museum, receiving 10.2 million visitors.[1]\n" +
            "\n" +
            "The museum is housed in the Louvre Palace, originally built as the Louvre castle in the late 12th to 13th century under Philip II. Remnants of the fortress are visible in the basement of the museum. Due to urban expansion, the fortress eventually lost its defensive function, and in 1546 Francis I converted it into the main residence of the French Kings.[4] The building was extended many times to form the present Louvre Palace. In 1682, Louis XIV chose the Palace of Versailles for his household, leaving the Louvre primarily as a place to display the royal collection, including, from 1692, a collection of ancient Greek and Roman sculpture.[5] In 1692, the building was occupied by the Académie des Inscriptions et Belles-Lettres and the Académie Royale de Peinture et de Sculpture, which in 1699 held the first of a series of salons. The Académie remained at the Louvre for 100 years.[6] During the French Revolution, the National Assembly decreed that the Louvre should be used as a museum to display the nation's masterpieces.\n" +
            "\n" +
            "The museum opened on 10 August 1793 with an exhibition of 537 paintings, the majority of the works being royal and confiscated church property. Because of structural problems with the building, the museum was closed in 1796 until 1801. The collection was increased under Napoleon and the museum was renamed Musée Napoléon, but after Napoleon's abdication many works seized by his armies were returned to their original owners. The collection was further increased during the reigns of Louis XVIII and Charles X, and during the Second French Empire the museum gained 20,000 pieces. Holdings have grown steadily through donations and bequests since the Third Republic. The collection is divided among eight curatorial departments: Egyptian Antiquities; Near Eastern Antiquities; Greek, Etruscan and Roman Antiquities; Islamic Art; Sculpture; Decorative Arts; Paintings; Prints and Drawings.",
            "Disneyland Paris, formerly Euro Disney Resort, is an entertainment resort in Marne-la-Vallée, France, a new town located 32 km (20 mi) east of the centre of Paris. It encompasses two theme parks, many resort hotels, Disney Nature Resorts, a shopping, dining, and entertainment complex, and a golf course, in addition to several additional recreational and entertainment venues. Disneyland Park is the original theme park of the complex, opening with the resort on 12 April 1992. A second theme park, Walt Disney Studios Park, opened in 2002, 10 years after the original park. Disneyland Paris celebrated its 25th anniversary in 2017. Within 25 years of opening, 320 million people visited Disneyland Paris making it the most visited theme park in Europe.[1] The Parisian resort is the second Disney park to open outside the United States following the opening of the Tokyo Disney Resort in 1983 and is the largest Disney resort to open outside of the United States. Disneyland Paris is also the only Disney resort, outside of the United States, to be completely owned by The Walt Disney Company.",
    "The French Riviera (known in French as the Côte d'Azur [kot daˈzyʁ]; Occitan: Còsta d'Azur [ˈkɔstɔ daˈzyɾ]; literal translation \"Coast of Azure\") is the Mediterranean coastline of the southeast corner of France. There is no official boundary, but it is usually considered to extend from Cassis or Toulon on the west to the France–Italy border in the east, where the Italian Riviera joins.[1][2] The coast is entirely within the Provence-Alpes-Côte d'Azur (PACA) region of France. The Principality of Monaco is a semi-enclave within the region, surrounded on three sides by France and fronting the Mediterranean.\n" +
            "\n" +
            "This coastline was one of the first modern resort areas. It began as a winter health resort for the British upper class at the end of the 18th century. With the arrival of the railway in the mid-19th century, it became the playground and vacation spot of British, Russian, and other aristocrats, such as Queen Victoria and King Edward VII, when he was Prince of Wales. In the summer, it also played home to many members of the Rothschild family. In the first half of the 20th century, it was frequented by artists and writers, including Pablo Picasso, Henri Matisse, Francis Bacon,[3] Edith Wharton, Somerset Maugham and Aldous Huxley, as well as wealthy Americans and Europeans. After World War II, it became a popular tourist destination and convention site. Many celebrities, such as Elton John and Brigitte Bardot, have homes in the region. Officially, the French Riviera is home to 163 nationalities with 83,962 foreign residents,[4] although estimates of the number of non-French nationals living in the area are often much higher.[5]\n" +
            "\n" +
            "Its largest city is Nice, which has a population of 347,060 (2006).[6] The city is the center of a communauté urbaine – Nice-Côte d'Azur – bringing together 24 communes and more than 500,000 inhabitants and 933,080 in the urban area. Nice is home to Nice Côte d'Azur Airport, France's third-busiest airport (after Charles de Gaulle Airport and Orly Airport), which is on an area of partially reclaimed coastal land at the western end of the Promenade des Anglais. A second airport at Mandelieu was once the region's commercial airport,[7] but is now mainly used by private and business aircraft.[8] The A8 autoroute runs through the region, as does the old main road generally known as the Route nationale 7 (officially now the DN7 in the Var and the D6007 in the Alpes-Maritimes).[9] High-speed trains serve the coastal region and inland to Grasse, with the TGV Sud-Est service reaching Nice-Ville station in five and a half hours from Paris.\n" +
            "\n" +
            "The French Riviera has a total population of more than two million. It contains the seaside resorts of Cap-d'Ail, Beaulieu-sur-Mer, Saint-Jean-Cap-Ferrat, Villefranche-sur-Mer, Antibes, Juan-les-Pins, Cannes, Saint-Raphaël, Fréjus, Sainte-Maxime and Saint-Tropez.[10] It is also home to a high-tech and science park (French: technopole) at Sophia-Antipolis (north of Antibes), and a research and technology center at the University of Nice Sophia-Antipolis. The region has 35,000 students, of whom 25 percent are working toward a doctorate.[11]\n" +
            "\n" +
            "The French Riviera is a major yachting and cruising area with several marinas along its coast. According to the Côte d'Azur Economic Development Agency, each year the Riviera hosts 50 percent of the world's superyacht fleet, with 90 percent of all superyachts visiting the region's coast at least once in their lifetime.[12] As a tourist centre, French Riviera benefits from 310 to 330 days of sunshine per year, 115 kilometres (71 miles) of coastline and beaches, 18 golf courses, 14 ski resorts and 3,000 restaurants."};
   String view2[] = {"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563384194673!6m8!1m7!1sCAoSLEFGMVFpcE1oVnFUODFfc0lld2pVUmYxazhKLW9HR0pwVnFQRC1ZNXRmQVVN!2m2!1d48.858838!2d2.2936468!3f128.3856977006377!4f20.51078230333877!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563384511158!6m8!1m7!1sCAoSLEFGMVFpcE1hd2ZYR3QwMGZ0bVRZMVdGQ2RGU3U0QmpOeUV2NUVlalBjUTFL!2m2!1d48.860611!2d2.337644!3f75.59931903256667!4f5.472724704011185!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563384741674!6m8!1m7!1s6gn4hfwC4ItbJV0XhB3xQg!2m2!1d48.8725188403687!2d2.776411867420165!3f339.2961813332034!4f-9.713932111566493!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
   "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563384969912!6m8!1m7!1sCAoSLEFGMVFpcE0wbFlzRVJFcTUzT203am44STlvX0VOdV8yWDJQWmVRR0J5a29f!2m2!1d43.9466791!2d7.179025999999999!3f121.16715638745094!4f-22.92783994999438!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV3=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV3.setAdapter(myAdapter2);
        GV3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                Intent france_details = new Intent(France.this, France_Details.class);
                france_details.putExtra("Name",arr3[position]);
                france_details.putExtra("Image",images3[position]);
                france_details.putExtra("Des",des2[position]);
                france_details.putExtra("View",view2[position]);
                startActivity(france_details);

            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr3.length;
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
            img2.setImageResource(images3[position]);
            text2.setText(arr3[position]);
            return convertview;
        }
    }
}