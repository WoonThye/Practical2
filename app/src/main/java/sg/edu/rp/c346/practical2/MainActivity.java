package sg.edu.rp.c346.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvBaboon;
    TextView tvBactrianCamel;
    TextView tvBadger;
    TextView tvBaiji;
    TextView tvBalinese;
    TextView tvBandedPalmCivet;
    TextView tvBandicoot;
    TextView tvBanjoCatfish;
    TextView tvBarb;
    TextView tvBarnOwl;
    String wordClicked = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvBaboon = findViewById(R.id.Baboon);
        tvBactrianCamel = findViewById(R.id.BactrianCamel);
        tvBadger = findViewById(R.id.Badger);
        tvBaiji = findViewById(R.id.Baiji);
        tvBalinese = findViewById(R.id.Balinese);
        tvBandedPalmCivet = findViewById(R.id.BandedPalmCivet);
        tvBandicoot = findViewById(R.id.Bandicoot);
        tvBanjoCatfish = findViewById(R.id.BanjoCatfish);
        tvBarb = findViewById(R.id.Barb);
        tvBarnOwl = findViewById(R.id.BarnOwl);

        registerForContextMenu(tvBaboon);
        registerForContextMenu(tvBactrianCamel);
        registerForContextMenu(tvBadger);
        registerForContextMenu(tvBaiji);
        registerForContextMenu(tvBalinese);
        registerForContextMenu(tvBandedPalmCivet);
        registerForContextMenu(tvBandicoot);
        registerForContextMenu(tvBanjoCatfish);
        registerForContextMenu(tvBarb);
        registerForContextMenu(tvBarnOwl);


        tvBaboon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "Baboon");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Grassland,rockey desert and rainforest");
                i.putExtra("Prey", "Fruits,Seeds,Insects");
                i.putExtra("Location", "Africa and Western Arabia");
                i.putExtra("lifespan", "15 - 40 years");
                i.putExtra("color", "Brown\n" +
                        "             Grey\n" +
                        "             Yellow\n" +
                        "             Black\n" +
                        "             Silver\n" +
                        "             Olive");
                i.putExtra("Weight", "14kg-45kg(30lbs-100lbs)");
                i.putExtra("Height", "50cm - 86cm(20in-34in)");
                i.putExtra("description", "The Baboon is a medium to large sized species of Old World Monkey that is found in a variety of different habitats throughout Africa and in parts of Arabia.Baboons are incredibly sociable and intelligent animals that are known to form close bonds with other members of the troop that often last for life. They are also incredibly adaptable animals but their population numbers are declining throughout their natural range primarily due to hunting and habitat loss.");


                startActivity(i);

            }
        });
        tvBactrianCamel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "BactrianCamel");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Deserts close to water");
                i.putExtra("Prey", "Seeds, Grass, Thorny Shrubs");
                i.putExtra("Location", "Asia");
                i.putExtra("lifespan", "35 - 50 years");
                i.putExtra("color", "Brown\n" +
                        "             Tan");
                i.putExtra("Weight", "600kg - 816kg (1,322lbs - 1,800lbs)");
                i.putExtra("Height", "1.7m - 2.1m (5.5ft - 7ft)");
                i.putExtra("description", "Badgers are medium-sized animals with long, low bodies and wide feet that have elongated claws. The animals have bristly hair that ranges in color from black to brown as well as gold and even white.The mammals are nocturnal, and while many of them are social, some may be loners. The badger is Wisconsin’s state animal. ");


                startActivity(i);
            }
        });
        tvBadger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "Badger");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Woodland and hedgerows");
                i.putExtra("Prey", "Worms, Roots, Fruit");
                i.putExtra("Location", "Europe");
                i.putExtra("lifespan", "4 - 10 years");
                i.putExtra("color", "Brown\n" +
                        "             Black\n" +
                        "             White");
                i.putExtra("Weight", "11kg - 14kg (24lbs - 30lbs)");
                i.putExtra("Height", "40cm - 75cm (16in - 29in))");
                i.putExtra("description", "Double-humped camels are called Bactrian camels. Bactrian camels are omnivores. They prefer to eat shrubs, but in a pinch will consume whatever is around, including meat, fish, and fabric. They have two humps that store fat. The animals access it in times of famine and convert the fat into nutrients, energy, and water. ");


                startActivity(i);
            }
        });
        tvBaiji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "Baiji");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "River");
                i.putExtra("Prey", "Yellow catfish, carp, copper fish");
                i.putExtra("Location", "China");
                i.putExtra("lifespan", "24 years");
                i.putExtra("color", "Grey\n" +
                        "             Blue\n" +
                        "             White");
                i.putExtra("Weight", "368 lbs");
                i.putExtra("Height", "7.5-8.5 feet");
                i.putExtra("description", "The baiji is an animal bluish gray back and a white underside that lives in the Yangtze River in China. They have 30 to 36 sharp teeth on their upper and lower jaws. A baiji has one stomach that’s divided into three chambers whereas most dolphins have two stomachs. Their nose is long and beaklike. They have rounded fins that allow them to move swiftly through river water. ");
                startActivity(i);
            }
        });
        tvBalinese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "Balinese");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "River");
                i.putExtra("Prey", "Not listed");
                i.putExtra("Location", "North-America");
                i.putExtra("lifespan", "24 years");
                i.putExtra("color", "Brown\n" +
                        "             Black\n" +
                        "             Chocolate\n" +
                        "             Lilac\n" +
                        "             Caramel");
                i.putExtra("Weight", "121 lbs");
                i.putExtra("Height", "60cm");
                i.putExtra("description", "The Balinese is a long-haired breed of domestic cat with Siamese-style point coloration and sapphire-blue eyes. The Balinese is also known as the purebred long-haired Siamese, since it originated as a natural mutation of that breed and hence is essentially the same cat with a medium-length silky coat and a distinctively plumed tail");


                startActivity(i);
            }
        });
        tvBandedPalmCivet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "BandedPalmCivet");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Tropical rainforest");
                i.putExtra("Prey", "Rodents, Snakes, Frogs");
                i.putExtra("Location", "Asia");
                i.putExtra("lifespan", "15 - 20 years");
                i.putExtra("color", "Brown\n" +
                        "             Grey\n" +
                        "             Yellow\n" +
                        "             Black\n" +
                        "             White\n" +
                        "             Tan");
                i.putExtra("Weight", "1.4kg - 4.5kg (3lbs - 10lbs)");
                i.putExtra("Height", "43cm - 71cm (17in - 28in)");
                i.putExtra("description", "The banded palm civet (Hemigalus derbyanus), also called banded civet, is a viverrid native to Myanmar, Peninsular Malaysia, peninsular Thailand and the Sunda Islands of Sipura, Sumatra and Borneo. It is listed as Near Threatened on the IUCN Red List because of its large geographic and elevation range and tolerance to some habitat disturbance.");

                startActivity(i);
            }
        });
        tvBandicoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "Bandicoot");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Tropical rainforest");
                i.putExtra("Prey", "Insects, Fruit, Seeds");
                i.putExtra("Location", "Oceania");
                i.putExtra("lifespan", "3 - 7 years");
                i.putExtra("color", "Brown\n" +
                        "             Grey\n" +
                        "             Yellow\n" +
                        "             Black\n" +
                        "             White\n" +
                        "             Tan");
                i.putExtra("Weight", "0.2kg - 1.6kg (0.4lbs - 3.5lbs)");
                i.putExtra("Height", "28cm - 81cm (11in - 32in)");
                i.putExtra("description", "Bandicoots are a group of more than 20 species of small to medium-sized, terrestrial marsupial omnivores in the order Peramelemorphia. They are endemic to the Australia–New Guinea region, including the Bismarck Archipelago and, marginally, in Indonesia.");
                startActivity(i);
            }
        });
        tvBanjoCatfish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "BanjoCatfish");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Amazon river basin, South American streams and ponds");
                i.putExtra("Prey", "Earthworms, bloodworms, tubifex");
                i.putExtra("Location", "South American");
                i.putExtra("lifespan", "8 - 10 years");
                i.putExtra("color", "Brown\n" + "             Yellow\n" + "             Black\n");

                i.putExtra("Weight", "Not Listed");
                i.putExtra("Height", "5 - 15 centimeters ");
                i.putExtra("description", "The common name of the family \"banjo catfishes\" refers to their overall body shape, with a depressed head and slender caudal peduncle, that in some species gives the appearance of a banjo. Banjo catfishes lack an adipose fin. Most species lack the dorsal spine-locking mechanism.");

                startActivity(i);
            }
        });
        tvBarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "Barb");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Slow flowing rivers and lagoons");
                i.putExtra("Prey", "Fish, Shrimp, Algae");
                i.putExtra("Location", "Africa,Asia,Eurasia,South-America");
                i.putExtra("lifespan", "3 - 7 years");
                i.putExtra("color", "Yellow\n" +
                        "             Red\n" +
                        "             Black\n" +
                        "             White\n" +
                        "             Orange\n" +
                        "             Silver");

                i.putExtra("Weight", "Not Listed");
                i.putExtra("Height", "2.5cm - 7cm (1in - 3in)");
                i.putExtra("description", "Barb are a small sized group of fish that are naturally found in the freshwater rivers and lakes across the southern hemisphere. There are over 2,000 known species of barb in the world inhabiting the freshwater regions of Asia, Africa and South America.");


                startActivity(i);
            }
        });
        tvBarnOwl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Details.class);
                i.putExtra("Animalname", "BarnOwl");
                i.putExtra("Kingdom", "Animalia");
                i.putExtra("Habitat", "Open plains and low-lying woodland");
                i.putExtra("Prey", "Small mammals, Fish, Birds");
                i.putExtra("Location", "Africa,Asia,Eurasia,South-America,Central-America,Europe,North-America,Oceania");

                i.putExtra("lifespan", "5 - 10 years");
                i.putExtra("color", "\n" +
                        "             Brown\n" +
                        "             Grey\n" +
                        "             Black\n" +
                        "             White\n" +
                        "             Orange");

                i.putExtra("Weight", "300g - 550g (10oz - 19.4oz)");
                i.putExtra("Height", "25cm - 45cm (9.8in - 18in)");
                i.putExtra("description", "They are extremely widespread, one of the most widespread bird species on earth. Barn owls keep the rodent population in check wherever they live by preying on rats and mice primarily. In many cultures, they are seen as harbingers of death or symbolize the afterlife.");

                startActivity(i);
            }
        });


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.meun_main, menu);

        if (v == tvBaboon) {
            wordClicked = "tvBaboon";
            Log.v("Context", "tvBaboon selected");//
        } else if (v == tvBactrianCamel) {
            wordClicked = "tvBactrianCamel";
            Log.v("Context", "tvBactrianCamel selected");//

        } else if (v == tvBadger) {
            wordClicked = "tvBadger";
            Log.v("Context", "tvBadger selected");//


        } else if (v == tvBaiji) {
            wordClicked = "tvBaiji";
            Log.v("Context", " tvBaiji selected");//

        } else if (v == tvBalinese) {
            wordClicked = "tvBalinese";
            Log.v("Context", " tvBalinese selected");//

        } else if (v == tvBandedPalmCivet) {
            wordClicked = "tvBandedPalmCivet ";
            Log.v("Context", "tvBandedPalmCivet selected");//

        } else if (v == tvBandicoot) {
            wordClicked = "tvBandicoot";
            Log.v("Context", " tvBandicoot selected");//


        } else if (v == tvBanjoCatfish) {
            wordClicked = "tvBanjoCatfish";
            Log.v("Context", "  tvBanjoCatfish selected");//

        } else if (v == tvBarb) {
            wordClicked = "tvBarb";
            Log.v("Context", " tvBarb selected");//

        } else if (v == tvBarnOwl) {
            wordClicked = "tvBarnOwl";
            Log.v("Context", " tvBarnOwl selected");//

        }



    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

            if (wordClicked.equalsIgnoreCase("tvBaboon")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Baboonwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBactrianCamel")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.BactrianCamelwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBadger")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.tvBadgerwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBaiji")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Baijiwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBalinese")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Balinesewebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBandedPalmCivet")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.BandedPalmCivetewebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBandicoot")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Bandicootwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBanjoCatfish")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.BanjoCatfishwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBarb")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.Barbwebsite)));
                startActivity(i);


            } else if (wordClicked.equalsIgnoreCase("tvBarnOwl")) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.BarnOwlwebsite)));
                startActivity(i);


            }



        return super.onContextItemSelected(item);

    }

}
