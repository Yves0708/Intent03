package net.cloud95.android.lession.intent03;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MapsActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent03);
		// 取得ListView物件
		ListView listview = (ListView) findViewById(R.id.listview);

		// 建立指定陣列資源的ArrayAdapter物件
		ArrayAdapter<CharSequence> adapterActions = ArrayAdapter
				.createFromResource(this, R.array.maps_menu_array,
						android.R.layout.simple_list_item_1);
		// 設定ArrayAdapter物件給ListView物件
		listview.setAdapter(adapterActions);
		// 項目選擇事件
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				Uri uri = null;

				switch (position) {
				// 地圖
				case 0:
				{
					// 座標
					String point = "25.053861,121.490676";
					// 縮放，1到23
					String zoom = "16";
					uri = Uri.parse("geo:" + point + "?z=" + zoom);
					break;
				}
				// 路徑規劃
				case 1:
					// 起點座標
					String from = "25.053861,121.490676";
					// 終點座標
					String to = "25.046648,121.515012";
					// 建立Uri物件
					uri = Uri.parse("http://maps.google.com/maps?f=d&saddr="
							+ from + "&daddr=" + to);
					break;
				// 街景
				case 2:
					// 座標
					String point = "25.046648,121.51501";
					// 方向，0到360，0為北，90為東，180為南，270為西
					String direction = "0";
					// 街景放大倍率
					String streetZoom = "1.0";
					// 上下角度，-90為正上方，0為水平，90為正下方
					String vertical = "0";
					// 縮放，1到23
					String zoom = "16";
					uri = Uri.parse("google.streetview:cbll=" + point
							+ "&cbp=1," + direction + ",," + streetZoom + ","
							+ vertical + "&mz=" + zoom);
					break;
				}
				// 建立指定為查詢Action名稱的Intent物件
				Intent intent = new Intent(Intent.ACTION_VIEW);
				// 設定Uri物件
				intent.setData(uri);
				// 啟動元件
				startActivity(intent);
			}
		});

	}
}
