package com.ksusha.fish;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;


public class Text_Content_Activity extends AppCompatActivity {
    private ActionBar actionBar;
    private TextView text_content;
    private int category = 0;
    private int position = 0;
    private final int[] array_ukrmova = {
            R.string.ukr_mova_1, R.string.ukr_mova_2, R.string.ukr_mova_3, R.string.ukr_mova_4, R.string.ukr_mova_5,
            R.string.ukr_mova_6, R.string.ukr_mova_7, R.string.ukr_mova_8, R.string.ukr_mova_9, R.string.ukr_mova_10,
            R.string.ukr_mova_11, R.string.ukr_mova_12, R.string.ukr_mova_13, R.string.ukr_mova_14, R.string.ukr_mova_15,
            R.string.ukr_mova_16, R.string.ukr_mova_17, R.string.ukr_mova_18, R.string.ukr_mova_19, R.string.ukr_mova_20,
            R.string.ukr_mova_21, R.string.ukr_mova_22, R.string.ukr_mova_23, R.string.ukr_mova_24, R.string.ukr_mova_25,
            R.string.ukr_mova_26, R.string.ukr_mova_27, R.string.ukr_mova_28, R.string.ukr_mova_29, R.string.ukr_mova_30,
            R.string.ukr_mova_31, R.string.ukr_mova_32, R.string.ukr_mova_33, R.string.ukr_mova_34, R.string.ukr_mova_35,
            R.string.ukr_mova_36, R.string.ukr_mova_37, R.string.ukr_mova_38, R.string.ukr_mova_39, R.string.ukr_mova_40, R.string.ukr_mova_41,
    };
    private final String[] array_ukr_mova = {
            "Фонетика. Орфографія(частина 1).", "Орфографія(2 частина).", "Орфографія(частина 3).", "Будова слова(частина 1).", "Будова слова(частина 2).", "Словотвір.",
            "Лексикологія(частина 1).", "Лексикологія(частина 2)", "Фразеологія.", "Іменник(частина 1).", "Іменник(частина 2).", "Іменник(частина 3).",
            "Іменник(частина 4).", "Прикметник(частина 1).", "Прикметник(частина 2).", "Числівник(частина 1).", "Числівник(частина 2).",
            "Займенник(частина 1).", "Займенник(частина 2).", "Прислівник.", "Дієслово(частина 1).", "Дієслово(частина 2).", "Дієприкметник.", "Дієприслівник.",
            "Прийменник.", "Сполучник.", "Частка.", "Вигук.", "Словосполучення.", "Речення(частина 1).", "Речення(частина 2).", "Речення(частина 3).",
            "Речення(частина 4).", "Речення(частина 5).", "Пряма і непряма мова.", "Види складних речень(частина 1).", "Види складних речень(частина 2).",
            "Лінгвістика тексту(частина 1).", "Лінгвістика тексту(частина 2).", "Риторика(частина 1).", "Риторика(частина 2)",
    };


    private final int[] array_ukrlitra = {
            R.string.ukr_litra_1, R.string.ukr_litra_2, R.string.ukr_litra_3, R.string.ukr_litra_4, R.string.ukr_litra_5,
            R.string.ukr_litra_6, R.string.ukr_litra_7, R.string.ukr_litra_8, R.string.ukr_litra_9, R.string.ukr_litra_10,
            R.string.ukr_litra_11, R.string.ukr_litra_12, R.string.ukr_litra_13, R.string.ukr_litra_14, R.string.ukr_litra_15,
            R.string.ukr_litra_16, R.string.ukr_litra_17, R.string.ukr_litra_18, R.string.ukr_litra_19, R.string.ukr_litra_20,
            R.string.ukr_litra_21, R.string.ukr_litra_22, R.string.ukr_litra_23, R.string.ukr_litra_24, R.string.ukr_litra_25,
            R.string.ukr_litra_26, R.string.ukr_litra_27, R.string.ukr_litra_28, R.string.ukr_litra_29, R.string.ukr_litra_30,
            R.string.ukr_litra_31, R.string.ukr_litra_32, R.string.ukr_litra_33, R.string.ukr_litra_34, R.string.ukr_litra_35,
            R.string.ukr_litra_36, R.string.ukr_litra_37, R.string.ukr_litra_38, R.string.ukr_litra_39, R.string.ukr_litra_40,
            R.string.ukr_litra_41, R.string.ukr_litra_42, R.string.ukr_litra_43, R.string.ukr_litra_44, R.string.ukr_litra_45,
            R.string.ukr_litra_46, R.string.ukr_litra_47, R.string.ukr_litra_48, R.string.ukr_litra_49, R.string.ukr_litra_50,
            R.string.ukr_litra_51, R.string.ukr_litra_52, R.string.ukr_litra_53, R.string.ukr_litra_54, R.string.ukr_litra_55,
            R.string.ukr_litra_56, R.string.ukr_litra_57, R.string.ukr_litra_58, R.string.ukr_litra_59, R.string.ukr_litra_60,
            R.string.ukr_litra_61, R.string.ukr_litra_62, R.string.ukr_litra_63, R.string.ukr_litra_64, R.string.ukr_litra_65,
            R.string.ukr_litra_66, R.string.ukr_litra_67, R.string.ukr_litra_68, R.string.ukr_litra_69, R.string.ukr_litra_70,

    };
    private final String[] array_ukr_litra = {
            "Теорія літератури(частина 1).", "Теорія літератури(частина 2).", "Теорія літератури(частина 3).", "Теорія літератури(частина 4).",
            "Теорія літератури(частина 5).", "Теорія літератури(частина 6).", "Теорія літератури(частина 7).", "Періодизація розвитку української літератури(частина 1).",
            "Періодизація розвитку української літератури(частина 2).", "Періодизація розвитку української літератури(частина 3).", "Періодизація розвитку української літератури(частина 4).",
            "Давня література(частина 1).", "Давня література(частина 2).", "Давня література(частина 3).", "Давня література(частина 4).", "Література кінця XVIII-початку XX ст.(частина 1).",
            "Література кінця XVIII-початку XX ст.(частина 2).", "Література кінця XVIII-початку XX ст.(частина 3).", "Література кінця XVIII-початку XX ст.(частина 4).",
            "Література кінця XVIII-початку XX ст.(частина 5).", "Література кінця XVIII-початку XX ст.(частина 6).", "Тарас Шевченко(частина 1).", "Тарас Шевченко(частина 2).",
            "Тарас Шевченко(частина 3).", "Тарас Шевченко(частина 4).", "Пантелеймон Куліш(частина 1).", "Пантелеймон Куліш(частина 2).", "І. Нечуй-Левицький(частина 1).",
            "І. Нечуй-Левицький(частина 2).", "Панас Мирний(частина 1).", "Панас Мирний(частина 2).", "Іван Карпенко-Карий.", "Іван Франко(частина 1).", "Іван Франко(частина 2).",
            "Михайло Коцюбинський(частина 1).", "Михайло Коцюбинський(частина 2).", "Василь Стефаник.", "Ольга Кобилянська.", "Леся Українка(частина 1).",
            "Леся Українка(частина 2).", "Леся Українка(частина 3).", "Леся Українка(частина 4).", "ОСНОВНІ СТИЛЬОВІ НАПРЯМИ 20-30-х років XX ст(частина 1).",
            "ОСНОВНІ СТИЛЬОВІ НАПРЯМИ 20–30-х років XX ст(частина 2).", "Микола Вороний.", "Олександр Олесь.", "Павло Тичина", "Максим Рильський.",
            "Микола Хвильовий.", "Юрій Яновський.", "Володимир Сосюра.", "Микола Куліш.", "Остап Вишня.", "Валер'ян Підмогильний.", "Валер'ян Підмогильний(частина 2).",
            "Богдан-Ігор Антонич.", "Олександр Довженко(частина 1).", "Олександр Довженко(частина 2).", "Андрій Малишко.", "ШІСТДЕСЯТНИЦТВО", "Василь Симоненко.",
            "Василь Голобородько.", "Григір Тютюнник.", "Василь Стус(частина 1).", "Василь Стус(частина 2).", "Дмитро Павличко.", "Ліна Костенко.",
            "Іван Багряний.", "Євген Маланюк.",};
    private final int[] array_nagolosi = {R.string.nagolosi,};
    private final String[] array_nagolosy = {"Наголоси.",};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        init();
        reciveIntent();
    }

    private void reciveIntent() {
        Intent i = getIntent();
        if (i != null) {
            category = i.getIntExtra("category", 0);
            position = i.getIntExtra("position", 0);
        }
        switch (category) {
            case 0:
                text_content.setText(array_ukrmova[position]);
                actionBar.setTitle(array_ukr_mova[position]);
                break;
            case 1:
                text_content.setText(array_ukrlitra[position]);
                actionBar.setTitle(array_ukr_litra[position]);
                break;
            case 2:
                text_content.setText(array_nagolosi[position]);
                actionBar.setTitle(array_nagolosy[position]);
                break;

        }
    }

    private void init() {
        text_content = findViewById(R.id.text_main_content);
        Typeface face1 = Typeface.createFromAsset(this.getAssets(), "fonts/Bitter-Regular.ttf");
        text_content.setTypeface(face1);
        actionBar = getSupportActionBar();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
