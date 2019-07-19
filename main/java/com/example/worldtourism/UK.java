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

public class UK extends AppCompatActivity {
    GridView GV5;
    String arr5[]={"The Britsh Museum", "Stonehenge", "Tower Bridge", "The National Gallery"};
    int images5[]={R.drawable.britishmuseum, R.drawable.stonehenge, R.drawable.towerbridge, R.drawable.thenationalgallery};
    String des4[]={"The British Museum, in the Bloomsbury area of London, United Kingdom, is a public institution dedicated to human history, art and culture. Its permanent collection of some eight million works is among the largest and most comprehensive in existence,[3] having been widely sourced during the era of the British Empire. It documents the story of human culture from its beginnings to the present.[a] It was the first public national museum in the world.[4]\n" +
            "\n" +
            "The British Museum was established in 1753, largely based on the collections of the Irish physician and scientist Sir Hans Sloane.[5] It first opened to the public in 1759, in Montagu House, on the site of the current building. Its expansion over the following 250 years was largely a result of expanding British colonisation and has resulted in the creation of several branch institutions, the first being the Natural History Museum in 1881.\n" +
            "\n" +
            "In 1973, the British Library Act 1972 detached the library department from the British Museum, but it continued to host the now separated British Library in the same Reading Room and building as the museum until 1997. The museum is a non-departmental public body sponsored by the Department for Digital, Culture, Media and Sport, and as with all national museums in the UK it charges no admission fee, except for loan exhibitions.[6]\n" +
            "\n" +
            "Its ownership of some of its most famous objects originating in other countries is disputed and remains the subject of international controversy, most notably in the case of the Parthenon Marbles.",
    "Stonehenge is a prehistoric monument in Wiltshire, England, two miles (3 km) west of Amesbury. It consists of a ring of standing stones, with each standing stone around 13 feet (4.0 m) high, seven feet (2.1 m) wide and weighing around 25 tons. The stones are set within earthworks in the middle of the most dense complex of Neolithic and Bronze Age monuments in England, including several hundred burial mounds.[1]\n" +
            "\n" +
            "Archaeologists believe it was constructed from 3000 BC to 2000 BC. The surrounding circular earth bank and ditch, which constitute the earliest phase of the monument, have been dated to about 3100 BC. Radiocarbon dating suggests that the first bluestones were raised between 2400 and 2200 BC,[2] although they may have been at the site as early as 3000 BC.[3][4][5]\n" +
            "\n" +
            "One of the most famous landmarks in the United Kingdom, Stonehenge is regarded as a British cultural icon.[6] It has been a legally protected Scheduled Ancient Monument since 1882 when legislation to protect historic monuments was first successfully introduced in Britain. The site and its surroundings were added to UNESCO's list of World Heritage Sites in 1986. Stonehenge is owned by the Crown and managed by English Heritage; the surrounding land is owned by the National Trust.[7][8]\n" +
            "\n" +
            "Stonehenge could have been a burial ground from its earliest beginnings.[9] Deposits containing human bone date from as early as 3000 BC, when the ditch and bank were first dug, and continued for at least another five hundred years.",
    "Tower Bridge is a combined bascule and suspension bridge in London, built between 1886 and 1894. The bridge crosses the River Thames close to the Tower of London and has become an iconic symbol of London. Because of this, Tower Bridge is sometimes confused with London Bridge, situated some 0.5 mi (0.80 km) upstream. Tower Bridge is one of five London bridges now owned and maintained by the Bridge House Estates, a charitable trust overseen by the City of London Corporation. It is the only one of the Trust's bridges not to connect the City of London directly to the Southwark bank, as its northern landfall is in Tower Hamlets.\n" +
            "\n" +
            "The bridge consists of two bridge towers tied together at the upper level by two horizontal walkways, designed to withstand the horizontal tension forces exerted by the suspended sections of the bridge on the landward sides of the towers. The vertical components of the forces in the suspended sections and the vertical reactions of the two walkways are carried by the two robust towers. The bascule pivots and operating machinery are housed in the base of each tower. Before its restoration in the 2010s, the bridge's colour scheme dated from 1977, when it was painted red, white and blue for Queen Elizabeth II's Silver Jubilee. Its colours were subsequently restored to blue and white.[1][2]\n" +
            "\n" +
            "The bridge deck is freely accessible to both vehicles and pedestrians, whereas the bridge's twin towers, high-level walkways and Victorian engine rooms form part of the Tower Bridge Exhibition, for which an admission charge is made. The nearest London Underground tube stations are Tower Hill on the Circle and District lines, London Bridge on the Jubilee and Northern lines and Bermondsey on the Jubilee line, and the nearest Docklands Light Railway station is Tower Gateway.[3] The nearest National Rail stations are at Fenchurch Street and London Bridge.",
    "The National Gallery is an art museum in Trafalgar Square in the City of Westminster, in Central London. Founded in 1824, it houses a collection of over 2,300 paintings dating from the mid-13th century to 1900.[note 1]\n" +
            "\n" +
            "The Gallery is an exempt charity, and a non-departmental public body of the Department for Culture, Media and Sport.[3] Its collection belongs to the government on behalf of the British public, and entry to the main collection is free of charge. It is among the most visited art museums in the world, after the Louvre, the British Museum, and the Metropolitan Museum of Art.[4]\n" +
            "\n" +
            "Unlike comparable museums in continental Europe, the National Gallery was not formed by nationalising an existing royal or princely art collection. It came into being when the British government bought 38 paintings from the heirs of John Julius Angerstein in 1824. After that initial purchase the Gallery was shaped mainly by its early directors, notably Sir Charles Lock Eastlake, and by private donations, which today account for two-thirds of the collection.[5] The collection is small compared with many European national galleries, but encyclopaedic in scope; most major developments in Western painting \"from Giotto to Cézanne\"[6] are represented with important works. It used to be claimed that this was one of the few national galleries that had all its works on permanent exhibition,[7] but this is no longer the case.\n" +
            "\n" +
            "The present building, the third to house the National Gallery, was designed by William Wilkins from 1832 to 1838. Only the façade onto Trafalgar Square remains essentially unchanged from this time, as the building has been expanded piecemeal throughout its history. Wilkins's building was often criticised for the perceived weaknesses of its design and for its lack of space; the latter problem led to the establishment of the Tate Gallery for British art in 1897.\n" +
            "\n" +
            "The Sainsbury Wing, an extension to the west by Robert Venturi and Denise Scott Brown, is a notable example of Postmodernist architecture in Britain. The current Director of the National Gallery is Gabriele Finaldi.\n"};
    String view4[]={"<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563387520934!6m8!1m7!1sCAoSLEFGMVFpcFBmaVVRRmdOY05VZVFvWUpkajFiUzROaS05NmhfbkRreXdnbGlT!2m2!1d51.49671499999999!2d-0.1763672!3f20!4f0!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563387660552!6m8!1m7!1sVBnrlmeoNKPv-TFzV2uGkg!2m2!1d51.1789241404188!2d-1.826257137510908!3f73.76213919891353!4f-7.419042823709447!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563387931216!6m8!1m7!1sCAoSLEFGMVFpcFBZMTNPdHJuQUU0RXM2SGdHRDZRWlBzSGNNVjh4ZmVmWWYzMTVs!2m2!1d51.5054564!2d-0.07535649999999999!3f134.63072!4f11.834699999999998!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>",
    "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1563388113801!6m8!1m7!1sCAoSLEFGMVFpcE0zMmtOZ0N4d3NGTXVOQ0tsc2ptWi00Zm90U25pMjZqbnlRZmIw!2m2!1d51.50885602912116!2d-0.1283047865641802!3f172.843474466716!4f-2.1572006167824753!5f0.7820865974627469\" width=\"400\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentactivity2);
        getSupportActionBar().hide();

        GV5=(GridView) findViewById(R.id.grid_v2);
        final MyAdapter2 myAdapter2= new MyAdapter2();
        GV5.setAdapter(myAdapter2);
        GV5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                Intent uk_details = new Intent(UK.this, UK_Details.class);
                uk_details.putExtra("Name",arr5[position]);
                uk_details.putExtra("Image",images5[position]);
                uk_details.putExtra("Des",des4[position]);
                uk_details.putExtra("View",view4[position]);
                startActivity(uk_details);
            }
        });

    }

    private class MyAdapter2 extends BaseAdapter {


        @Override
        public int getCount() {
            return arr5.length;
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
            img2.setImageResource(images5[position]);
            text2.setText(arr5[position]);
            return convertview;
        }
    }
}
