package com.example.ahmaadyunus.imageload;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String[][] data = new String[][]{
            {"Honda, Brio", "https://images.carbay.co.id/honda/92_brio/color/600x250/t/honda_brio_red.jpg"},
            {"Honda, Jazz", "https://media.zigcdn.com/media/model/2016/Feb/honda_jazz_600x300.jpg"},
            {"Mazda, Mazda2", "http://blog.caranddriver.com/wp-content/uploads/2014/07/2016-Mazda-2-photo-leak.jpg"},
            {"Suzuki, Swift", "http://suzuki.com.ph/auto/wp-content/themes/suzukiphauto/images/swift122/front.png"},
            {"Toyota, Yaris", "http://media.caranddriver.com/images/08q3/267371/2009-toyota-yaris-review-car-and-driver-photo-225692-s-450x274.jpg"},
            {"Toyota, Supra", "https://i.kinja-img.com/gawker-media/image/upload/s--O0IJNbjF--/c_scale,fl_progressive,q_80,w_800/isg0whn8lwgyjnd6zlqx.jpg"},
            {"Honda, Mobilio", "https://images0.cardekho.com/images/car-images/large/Honda/Honda-Mobilio/honda-mobilio-urban-titanium-metallic.jpg"},
            {"Toyota, Rush", "https://toyota.com.my/ToyotaOfficialWebsite/media/ToyotaMedia/model/Rush/colors_rush_champagne.jpg"},
            {"Honda, Freed", "https://www.honda-indonesia.com/uploads/img/models/sliders/54d65afae2154-freed.jpg"}
    };

    private ListView item_LV;
    private ArrayList item_List;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item_LV = (ListView)findViewById(R.id.listView);
        item_List = new ArrayList<>();

        DataModel data_list = null;

        for (int i = 0; i < data.length; i++){
            data_list = new DataModel();
            data_list.setTitle(data[i][0]);
            data_list.setImage(data[i][1]);

            item_List.add(data_list);
        }

        DataAdapter adapter = new DataAdapter (MainActivity.this, item_List);
        item_LV.setAdapter(adapter);


    }
}
