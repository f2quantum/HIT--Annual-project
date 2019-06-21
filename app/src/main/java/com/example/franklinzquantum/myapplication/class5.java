package com.example.franklinzquantum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class class5 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class5);
        ListView listView = (ListView) findViewById(R.id.listview5);//在视图中找到ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);//新建并配置ArrayAapeter
        listView.setAdapter(adapter);







    }

    String data[] ={"Мать 母亲","дочь 夜晚","мир 世界；和平","имя 名字","метро 地铁","днём 白天","вторник 星期二","кухня 厨房；菜肴","один 一","нет 不，不是，不对","Снег 学","Интернет 因特网","Собрание 会议","художник 艺术家","Отец 父亲","тётя 姨，姑，婶","юг 南方，南","темно 黑；暗","театр 剧院","текст 课文","институт 研究院，学院","тихо 安静","радио 广播","дядя 叔叔","дедушка 祖父，外祖父","бабушка 祖母，外祖母","где 在哪里","Девушка 姑娘","Дети 孩子们","делать 做","тетрадь 练习簿","язык 语言","Гость","  Гостя 客人","Их 他的","чай 茶","чей 谁的","час 小时，钟头","Часы 钟表","чисто 经常","вчера 昨天","ночью （在）夜里","Врач 医生","читать читаю читаешь читают 读","считать считаю счтаешь считают 数","почта 邮局","ручка 钢笔","дочка 女儿","чемпион 冠军","Учебник 教科书","Обычно 经常","ещё 还","Книга 书","общежитие 宿舍","овощи 蔬菜","плащ 风衣","счастье 幸福","ищу 寻找","работать работаю работаешь работают 工作","знать знаю знаешь знают 知道","Отдыхать отдыхаю отдыхаещъ отдыхают 休息","Ужнатъ ужнаю ужнаешь ужнают 吃晚饭","Слушатъ слушаю слушаешь слушают 听","Играть играю играешь играют 玩耍，玩","Жить живу живёшь живут 住，生活","Не 不","В 向；往；到......里；往......里","Шахматы -ат （复）象棋"};




















}


