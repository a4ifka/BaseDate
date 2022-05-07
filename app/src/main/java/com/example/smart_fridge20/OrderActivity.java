package com.example.smart_fridge20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent browserIntentYandex = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eda.yandex.ru/moscow?shippingType=delivery"));
        Intent browserIntentDelivery = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.delivery-club.ru/omsk?_1ld=3275882_1&utm_medium=cpc&utm_source=yandex&utm_campaign=%5BS%5D-DC-RGNT-noGRO-BRND-Main-Desktop-WA%7C70333069&utm_term=delivery%20club&utm_content=k50id%7C0100000035917032625_%7Ccid%7C70333069%7Cgid%7C4795043006%7Caid%7C11622299841%7Cadp%7Cno%7Cpos%7Cpremium1%7Csrc%7Csearch_none%7Cdvc%7Cdesktop%7C%25dop%25"));
        Intent browserIntentCbep = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sbermarket.ru/?utm_medium=cpc&utm_source=yandex&utm_campaign=inh_b2c_yd_ua_web-desk_brand_ru-all_sea|inhouse_search_ua-goal_desktop_brand_sberbank_city&utm_term=%D1%81%D0%B1%D0%B5%D1%80%20%D0%BF%D1%80%D0%BE%D0%B4%D1%83%D0%BA%D1%82%D1%8B&utm_content=k50id|0100000036527389200_|cid|71415769|gid|4825052320|aid|11746963031|adp|no|pos|premium1|src|search_none|dvc|desktop|main&k50id=0100000036527389200_&yadclid=88575393&yadordid=171415769&yclid=9139710321307680767"));

        TextView text = findViewById(R.id.text);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(browserIntentYandex);
            }
        });


        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(browserIntentDelivery);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(browserIntentCbep);
            }
        });

    }

}