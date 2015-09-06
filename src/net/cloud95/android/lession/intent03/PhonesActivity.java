package net.cloud95.android.lession.intent03;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PhonesActivity extends Activity {
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent03);

        // 取得ListView物件  
        ListView listview = (ListView)findViewById(R.id.listview);
        // 建立指定陣列資源的ArrayAdapter物件
        ArrayAdapter<CharSequence> adapterActions = ArrayAdapter
				.createFromResource(this, R.array.phones_menu_array,
						android.R.layout.simple_list_item_1);
        // 設定ArrayAdapter物件給ListView物件
        listview.setAdapter(adapterActions);
        // 項目選擇事件     
        listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				Uri uri = null;
			
				switch(position){
				// 準備撥打電話
				case 0:
					// 設定電話號碼
					uri = Uri.parse("tel:0933111222");
					intent.setAction(intent.ACTION_DIAL);
					break;
					// 直接撥打電話
				case 1:
					// 設定電話號碼
					uri = Uri.parse("tel:0933555888");
					intent.setAction(intent.ACTION_CALL);
					break;
				}
				// 設定Uri物件
				intent.setData(uri);
				
				// 啟動元件
				startActivity(intent);
			}
		});
                   
    }
    
}
