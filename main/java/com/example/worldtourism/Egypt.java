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

public class Egypt extends AppCompatActivity {
    GridView GV8;
    String arr8[]={"Pyramids Of Giza", "Aswan", "Egyptian Museum", "White Desert"};
    int images8[]={R.drawable.pyramidsofgiza, R.drawable.aswan, R.drawable.egyptianmuseum, R.drawable.whitedesert};
    String des7[]={"The Great Pyramid of Giza (also known as the Pyramid of Khufu or the Pyramid of Cheops) is the oldest and largest of the three pyramids in the Giza pyramid complex bordering present-day El Giza, Egypt. It is the oldest of the Seven Wonders of the Ancient World, and the only one to remain largely intact.\n" +
            "\n" +
            "Based on a mark in an interior chamber naming the work gang and a reference to the fourth dynasty Egyptian Pharaoh Khufu, some Egyptologists believe that the pyramid was thus built as a tomb over a 10- to 20-year period concluding around 2560 BC. Initially at 146.5 metres (481 feet), the Great Pyramid was the tallest man-made structure in the world for more than 3,800 years until Lincoln Cathedral was finished in 1311 AD. Originally, the Great Pyramid was covered by limestone casing stones that formed a smooth outer surface; what is seen today is the underlying core structure. Some of the casing stones that once covered the structure can still be seen around the base. There have been varying scientific and alternative theories about the Great Pyramid's construction techniques. Most accepted construction hypotheses are based on the idea that it was built by moving huge stones from a quarry and dragging and lifting them into place.\n" +
            "\n" +
            "There are three known chambers inside the Great Pyramid. The lowest chamber is cut into the bedrock upon which the pyramid was built and was unfinished. The so-called[1] Queen's Chamber and King's Chamber are higher up within the pyramid structure. The main part of the Giza complex is a set of buildings that included two mortuary temples in honour of Khufu (one close to the pyramid and one near the Nile), three smaller pyramids for Khufu's wives, an even smaller \"satellite\" pyramid, a raised causeway connecting the two temples, and small mastaba tombs surrounding the pyramid for nobles.",
    "Aswān, also spelled Assuan or Assouan, Greek Syene, city, capital of Aswān muḥāfaẓah (governorate), Egypt, on the east bank of the Nile River just below the First Cataract. It faces the island of Elephantine (modern Jazīrat Aswān), on which stand the ruins of the ancient city of Yeb. Aswān was the southern frontier of pharaonic Egypt. Its local quarries supplied granite for many ancient Egyptian monuments and are still operated. On the Nile’s eastern bank was the site of the ancient city of Swen (ancient Egyptian: “the Mart”), whence came the Greek Syene and the Arabic Aswān. Aswān later served as a frontier garrison post for the Romans, the Turks, and the British. Modern Aswān is an administrative centre, winter resort, and commercial centre, receiving trade from Sudan. It is also an industrial centre, with a copper- and steel-producing complex, a chemicals plant producing fertilizer, a cement plant, a sugar refinery, and quarries producing granite and marble. The old Aswān Dam (completed in 1902) rises about 3 miles (5 km) south of the city; the Aswan High Dam (completed in 1970) is about 7 miles (11 km) south of the city. The Higher Industrial Institute is located in Aswān. A school for fisheries training opened in 1980. On Elephantine a museum contains antiquities from the governorate." +
            " There are many hotels in the city, which is the southern terminus of the Cairo-Aswān railway. There is also an international airport. Pop. (2006) 266,013.",
    "The Museum of Egyptian Antiquities, known commonly as the Egyptian Museum or Museum of Cairo, in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities. The Egyptian Museum of Antiquities contains many important pieces of ancient Egyptian history. It houses the world's largest collection of Pharaonic antiquities. The Egyptian government established the museum built in 1835 near the Ezbekeyah Garden and later moved to the Cairo Citadel. In 1855, Archduke Maximilian of Austria was given all of the artifacts by the Egyptian government; these are now in the Kunsthistorisches Museum, Vienna.\n" +
            "\n" +
            "A new museum was established at Boulaq in 1858 in a former warehouse, following the foundation of the new Antiquities Department under the direction of Auguste Mariette. The building lay on the bank of the Nile River, and in 1878 it suffered significant damage in a flood of the Nile River. In 1891, the collections were moved to a former royal palace, in the Giza district of Cairo.[1] They remained there until 1902 when they were moved, for the last time, to the current museum in Tahrir Square.",
    "A main geographic attraction of Farafra is its White Desert (known as Sahara el Beyda, with the word sahara meaning a desert) — a national park of Egypt and 45 km (28 mi) north of the town of Farafra, the main draw of which is its rock type colored from snow-white to cream. It has massive chalk rock formations that are textbook examples of ventifact and which have been created as a result of occasional sandstorm in the area. The White Desert is a typical place visited by some schools in Egypt, as a location for camping trips. The desert was also the featured location in the music video accompanying the piece Echoes in the 2008–2011 album by the Klaxons. White Desert (known as Sahara el Beyda, with the word sahara meaning a desert). The White Desert of Egypt is located 45 km (28 mi) north of the town of Farafra. The desert has a white, cream color and has massive chalk rock formations that have been created as a result of occasional sandstorm in the area.\n" +
            "The majority of the valley is devoid of vegetation desert today. Rock and subsoil are usually made of limestone or chalk.\n" +
            "\n" +
            "The valley is flat and is interrupted only by a few isolated standing conical hills – both north and south of the city of el-Farafra, they are called el-Qunna, mostly spoken el-Gunna (Arabic: القنة, al-Qunna, “the pinnacle “). East of el-Quss-Abu-Sa ? id plateaus are also numerous small limestone mountains witnesses.\n" +
            "\n" +
            "The soil is blown with sand. It can be here but in places some minerals such as pyrite and marcasite (iron disulfide are both, but with different crystal form), especially in the north of the valley in the area of ? Ain Bischw?. The materials have been but never mined in mines.\n" +
            "\n" +
            "The result is the desert from the remains of microscopic sea creatures whose habitat was located here before about 80 million years ago. After the disappearance of the sea winds ensured for the expression of today’s rock whose shape was determined by the composition and hardness of the rocks and their layer sequence. Occasionally can find fossils such as clams or sea urchins.\n" +
            "\n"};
    String view7[]={"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563390293188!6m8!1m7!1ssCa8BZC2wCt80R7ntZ_hqA!2m2!1d29.97739526749804!2d31.13305953999426!3f20.08740232510968!4f4.3404160170191375!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563390433636!6m8!1m7!1sCAoSLEFGMVFpcE41WHo4UHNsRW8wdXVOaGpQYnBUclFGNmdLeE85LTNaX1FQRzI0!2m2!1d24.0919839!2d32.8859346!3f300!4f10!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563390743019!6m8!1m7!1sCAoSLEFGMVFpcFBTRFI0aXltcTBYRHoxOXlvZUUwdHNYTHNNeGE3VTg2MjdBV1VS!2m2!1d30.0481211!2d31.2336407!3f76.91382094130256!4f0.13842223710943813!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563390934454!6m8!1m7!1sCAoSLEFGMVFpcE1mS2ZKSFVvREZTM1h3cmN1bmpjUmlaWlZvYTdCaVhaeFpITmdu!2m2!1d27.0567362!2d27.9702964!3f240.3878191683795!4f-14.584163054914157!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV8=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV8.setAdapter(myAdapter2);
        GV8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                Intent egypt_details = new Intent(Egypt.this, Egypt_Details.class);
                egypt_details.putExtra("Name",arr8[position]);
                egypt_details.putExtra("Image",images8[position]);
                egypt_details.putExtra("Des",des7[position]);
                egypt_details.putExtra("View",view7[position]);
                startActivity(egypt_details);

            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr8.length;
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
            img2.setImageResource(images8[position]);
            text2.setText(arr8[position]);
            return convertview;
        }
    }
}