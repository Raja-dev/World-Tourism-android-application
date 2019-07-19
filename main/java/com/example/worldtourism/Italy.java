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

public class Italy extends AppCompatActivity {
    GridView GV4;
    String arr4[]={"Rome Colosseum", "Venice Canals", "Leaning Tower of Pisa", "Vatican City"};
    int images4[]={R.drawable.romecolosseum, R.drawable.venicecanals, R.drawable.leaningtowerofpisa, R.drawable.vaticancity};
    String des3[] = {"The Colosseum or Coliseum (/kɒləˈsiːəm/ kol-ə-SEE-əm), also known as the Flavian Amphitheatre (Latin: Amphitheatrum Flavium; Italian: Anfiteatro Flavio [aɱfiteˈaːtro ˈflaːvjo] or Colosseo [kolosˈsɛːo]), is an oval amphitheatre in the centre of the city of Rome, Italy. Built of travertine, tuff, and brick-faced concrete,[1] it is the largest amphitheatre ever built. The Colosseum is situated just east of the Roman Forum. Construction began under the emperor Vespasian in AD 72[2] and was completed in AD 80 under his successor and heir, Titus.[3] Further modifications were made during the reign of Domitian (81–96).[4] These three emperors are known as the Flavian dynasty, and the amphitheatre was named in Latin for its association with their family name (Flavius).\n" +
            "\n" +
            "The Colosseum could hold, it is estimated, between 50,000 and 80,000 spectators,[5][6] having an average audience of some 65,000;[7][8] it was used for gladiatorial contests and public spectacles such as mock sea battles (for only a short time as the hypogeum was soon filled in with mechanisms to support the other activities), animal hunts, executions, re-enactments of famous battles, and dramas based on Classical mythology. The building ceased to be used for entertainment in the early medieval era. It was later reused for such purposes as housing, workshops, quarters for a religious order, a fortress, a quarry, and a Christian shrine.\n" +
            "\n" +
            "Although partially ruined because of damage caused by earthquakes and stone-robbers, the Colosseum is still an iconic symbol of Imperial Rome and is listed as one of the New7Wonders of the World.[9] It is one of Rome's most popular tourist attractions and also has links to the Roman Catholic Church, as each Good Friday the Pope leads a torchlit \"Way of the Cross\" procession that starts in the area around the Colosseum.[10] In 2018, it was the most popular tourist attraction in the world, with 7.4 million visitors.",
    "Grand Canal, Italian Canale Grande, main waterway of Venice, Italy, following a natural channel that traces a reverse-S course from San Marco Basilica to Santa Chiara Church and divides the city into two parts.\n" +
            "\n" +
            "Slightly more than 2 miles (3 km) long and between 100 and 225 feet (30 and 70 metres) wide, the Grand Canal has an average depth of 17 feet (5 metres) and connects at various points with a maze of smaller canals. These waterways carry the bulk of Venetian transportation, as automobiles are banned throughout much of the city. Traditional poled gondolas are a favourite with tourists but are now vastly outnumbered by motorized public-transit water buses (vaporetti) and private water taxis. Siren-equipped boats belonging to the police, fire, and emergency medical services traverse the Grand Canal at high speed, and barges are responsible for the delivery of goods throughout the city. The connection between Venetians and their city’s main thoroughfare does not end at the grave: funeral barges can be seen transporting the dead to Isola di San Michele, an island northeast of the city that has been the site of Venice’s largest cemetery since the early 19th century. The Grand Canal is lined on either side by palaces, churches, hotels, and other public buildings in Romanesque, Gothic, and Renaissance styles. Although comparatively few examples of earlier styles remain, a concerted effort has been made to preserve some of Venice’s more famous palaces. The Ca’ d’Oro, a 15th-century palace designed for Marino Contarini, of the eminent Contarini family, was extensively renovated in the late 20th century, and its ornate facade remains one of the Grand Canal’s most-arresting sights. The Palazzo Pesaro is a remarkable example of the Classical style. Completed in 1710, nearly three decades after the death of its chief designer, Baldassare Longhena, it now houses Venice’s International Gallery of Modern Art, as well as the Museum of Oriental Art.",
    "The Leaning Tower of Pisa (Italian: Torre pendente di Pisa) or simply the Tower of Pisa (Torre di Pisa [ˈtorre di ˈpiːsa; ˈpiːza]) is the campanile, or freestanding bell tower, of the cathedral of the Italian city of Pisa, known worldwide for its nearly four-degree lean, the result of an unstable foundation. The tower is situated behind the Pisa Cathedral and is the third-oldest structure in the city's Cathedral Square (Piazza del Duomo), after the cathedral and the Pisa Baptistry.\n" +
            "\n" +
            "The tower's tilt began during construction in the 12th century, due to soft ground on one side, which was unable to properly support the structure's weight. The tilt increased in the decades before the structure was completed in the 14th century. It gradually increased until the structure was stabilized (and the tilt partially corrected) by efforts in the late 20th and early 21st centuries.\n" +
            "\n" +
            "The height of the tower is 55.86 metres (183.27 feet) from the ground on the low side and 56.67 metres (185.93 feet) on the high side. The width of the walls at the base is 2.44 m (8 ft 0.06 in). Its weight is estimated at 14,500 metric tons (16,000 short tons).[1] The tower has 296 or 294 steps; the seventh floor has two fewer steps on the north-facing staircase. In 1990 the tower leaned at an angle of 5.5 degrees,[2][3][4] but following remedial work between 1993 and 2001 this was reduced to 3.97 degrees,[5] reducing the overhang by 45 cm at a cost of £200m.[6] It lost a further 4 cm of tilt in the two decades to 2018.",
    "Vatican City, in full State of the Vatican City, Italian Stato della Città del Vaticano, ecclesiastical state, seat of the Roman Catholic Church, and an enclave in Rome, situated on the west bank of the Tiber River. Vatican City is the world’s smallest fully independent nation-state. Its medieval and Renaissance walls form its boundaries except on the southeast at St. Peter’s Square (Piazza San Pietro). Of the six entrances, only three—the piazza, the Arco delle Campane (Arch of the Bells) in the facade of St. Peter’s Basilica, and the entrance to the Vatican Museums and Galleries in the north wall—are open to the public. The most imposing building is St. Peter’s Basilica, built during the 4th century and rebuilt during the 16th century. Erected over the tomb of St. Peter the Apostle, it is the second largest religious building (after Yamoussoukro Basilica) in Christendom." +
            "It's home to the Pope and a trove of iconic art and architecture. Its Vatican Museums house ancient Roman sculptures such as the famed “Laocoön and His Sons” as well as Renaissance frescoes in the Raphael Rooms and the Sistine Chapel, famous for Michelangelo’s ceiling."};
    String view3[] = {"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563386309231!6m8!1m7!1sCAoSLEFGMVFpcE9rMlE5dThVMzJQa25IalNQR3o2U1REZ2FwRHRUd0F6b01nTjNv!2m2!1d41.8902102!2d12.4922309!3f325.38249300723567!4f-11.778219558572303!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563386690120!6m8!1m7!1sCAoSLEFGMVFpcE5xUHJFU0N4cjcxZGNudVpYa09GLXRFakg2eU9MMVB0c0tjMW9l!2m2!1d33.9845508!2d-118.466585!3f225.46518424877394!4f-15.834871577441504!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563386876778!6m8!1m7!1sCAoSLEFGMVFpcE40QV9FNm1IMUZoTnhyWVUzRlpmVUN5Sms3OTlvdU1VRERpbm9D!2m2!1d43.7229404!2d10.3963367!3f76.94773075351368!4f27.486961250022233!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563387011649!6m8!1m7!1sCAoSLEFGMVFpcFA1T3JHd2lfVG5ocFdfMUhKZk1TTEE2U2NqVW9aS3Z2bXhtRjhf!2m2!1d41.9016019!2d12.4576957!3f38.686985!4f10.990620000000007!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV4=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV4.setAdapter(myAdapter2);
        GV4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {

                Intent italy_details = new Intent(Italy.this, Italy_Details.class);
                italy_details.putExtra("Name",arr4[position]);
                italy_details.putExtra("Image",images4[position]);
                italy_details.putExtra("Des",des3[position]);
                italy_details.putExtra("View",view3[position]);
                startActivity(italy_details);

            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr4.length;
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
            img2.setImageResource(images4[position]);
            text2.setText(arr4[position]);
            return convertview;
        }
    }
}