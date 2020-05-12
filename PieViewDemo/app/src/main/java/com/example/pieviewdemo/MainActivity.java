/*
 * Copyright 2016 GcsSloop
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Last modified 2016-10-02 00:22:33
 *
 */

package com.example.pieviewdemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    PieView pieView;
    PieGraph pieGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieGraph = findViewById(R.id.pie1);
        pieView = findViewById(R.id.pie2);



        initData();
    }


    private void initData() {
        //饼状图1
        List<PieGraph.PieDataHolder> pieceDataHolders = new ArrayList<>();
        pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFFFFFF99, "江西"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFF663300, "南昌"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFF999933, "萍乡"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFFCC3333, "赣州"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(100, 0xFFFFFF00, "上饶"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(100, 0xFF336699, "小曾"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(170, 0xFF333399, "小吴"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFCC3366, "小谢"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFCC9999, "小明"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFF336633, "小高"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFFFFF00, "今天"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFFF6666, "明天"));
        pieceDataHolders.add(new PieGraph.PieDataHolder(130, 0xFF993399, "后天"));
        pieGraph.setPieData(pieceDataHolders);



        //饼状图2
        ArrayList<PieData> datas = new ArrayList<>();
        PieData pieData = new PieData("sloop", 20);
        PieData pieData2 = new PieData("sloop", 20);
        PieData pieData3 = new PieData("sloop", 20);
        PieData pieData4 = new PieData("sloop", 20);
        PieData pieData5 = new PieData("sloop", 80);
        datas.add(pieData);
        datas.add(pieData2);
        datas.add(pieData3);
        datas.add(pieData4);
        datas.add(pieData5);
        pieView.setData(datas);
    }



}
