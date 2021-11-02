package com.ksusha.zno_ukr;

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
            "Фонетика. Орфографія I.", "Орфографія II.", "Орфографія III.", "Будова слова I.", "Будова слова II.", "Словотвір.",
            "Лексикологія I.", "Лексикологія II.", "Фразеологія.", "Іменник I.", "Іменник II.", "Іменник III.",
            "Іменник IV.", "Прикметник I.", "Прикметник II.", "Числівник I.", "Числівник II.",
            "Займенник I.", "Займенник II.", "Прислівник.", "Дієслово I.", "Дієслово II.", "Дієприкметник.", "Дієприслівник.",
            "Прийменник.", "Сполучник.", "Частка.", "Вигук.", "Словосполучення.", "Речення I.", "Речення II.", "Речення III.",
            "Речення IV.", "Речення V.", "Пряма і непряма мова.", "Види складних речень I.", "Види складних речень II.",
            "Лінгвістика тексту I.", "Лінгвістика тексту II.", "Риторика I.", "Риторика II.",
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
            "Теорія літератури I.", "Теорія літератури II.", "Теорія літератури III.", "Теорія літератури IV.",
            "Теорія літератури V.", "Теорія літератури VI.", "Теорія літератури VII.", "Періодизація розвитку української літератури I.",
            "Періодизація розвитку української літератури II.", "Періодизація розвитку української літератури III.", "Періодизація розвитку української літератури IV.",
            "Давня література I.", "Давня література II.", "Давня література III.", "Давня література IV.", "Література кінця XVIII-початку XX ст. I.",
            "Література кінця XVIII-початку XX ст. II.", "Література кінця XVIII-початку XX ст. III.", "Література кінця XVIII-початку XX ст. IV.",
            "Література кінця XVIII-початку XX ст. V.", "Література кінця XVIII-початку XX ст. VI.", "Тарас Шевченко I.", "Тарас Шевченко II.",
            "Тарас Шевченко III.", "Тарас Шевченко IV.", "Пантелеймон Куліш I.", "Пантелеймон Куліш II.", "І. Нечуй-Левицький I.",
            "І. Нечуй-Левицький II.", "Панас Мирний I.", "Панас Мирний II.", "Іван Карпенко-Карий.", "Іван Франко I.", "Іван Франко II.",
            "Михайло Коцюбинський I.", "Михайло Коцюбинський II.", "Василь Стефаник.", "Ольга Кобилянська.", "Леся Українка I.",
            "Леся Українка II.", "Леся Українка III.", "Леся Українка IV.", "Основні стильові напрями 20–30-х років XX ст. I.",
            "Основні стильові напрями 20–30-х років XX ст. II.", "Микола Вороний.", "Олександр Олесь.", "Павло Тичина", "Максим Рильський.",
            "Микола Хвильовий.", "Юрій Яновський.", "Володимир Сосюра.", "Микола Куліш.", "Остап Вишня.", "Валер'ян Підмогильний I.", "Валер'ян Підмогильний II.",
            "Богдан-Ігор Антонич.", "Олександр Довженко I.", "Олександр Довженко II.", "Андрій Малишко.", "Шістдесятництво.", "Василь Симоненко.",
            "Василь Голобородько.", "Григір Тютюнник.", "Василь Стус I.", "Василь Стус II.", "Дмитро Павличко.", "Ліна Костенко.",
            "Іван Багряний.", "Євген Маланюк."};
    private final int[] array_nagolosi = {R.string.nagolosi,};
    private final String[] array_nagolosy = {"Наголоси.",};

    private final int[] array_frazeologizms = {R.string.frazeologizm_1};
    private final String[] array_frazeologizm = {"Фразеологізми"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        initialization();
        reciveIntent();
    }

    private void reciveIntent() {
        Intent i = getIntent(); //получение Intent
        if (i != null) {
            category = i.getIntExtra("category", 0); //получение категории
            position = i.getIntExtra("position", 0); //получение позиции
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
            case 3:
                text_content.setText(array_frazeologizms[position]);
                actionBar.setTitle(array_frazeologizm[position]);
                break;
        }
    }

    private void initialization() {
        text_content = findViewById(R.id.text_main_content);
        Typeface face1 = Typeface.createFromAsset(this.getAssets(), "fonts/Bitter-Regular.ttf"); //получение шрифта
        text_content.setTypeface(face1); //присваивание шрифта тексту
        actionBar = getSupportActionBar();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //переход на главную Activity
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
