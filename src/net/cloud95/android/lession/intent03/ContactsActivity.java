package net.cloud95.android.lession.intent03;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Intents.Insert;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContactsActivity extends Activity {
    
    private static final int EDIT_CONTACT = 0;
    private static final int ADD_CONTACT = 1;
    private static final int PICK_CONTACT = 2;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent03);
        
        // 取得ListView物件
        //建立指定陣列資源的ArrayAdapter物件
        // 設定ArrayAdapter物件給ListView物件
        // 項目選擇事件
                    // 設定準備新增聯絡人的URI物件
                    // 設定Action名稱為新增
                    // 設定聯絡人名稱、電話與電話種類
                    // 設定Uri物件
                    // 啟動新增聯絡人元件
                    // 設定準備查詢1號聯絡人的URI物件
                    // 設定Action名稱為查詢
                    // 設定Uri物件
                    // 啟動修改聯絡人元件
                    // 設定準備修改1號聯絡人的URI物件
                    // 設定Action名稱為修改
                    // 設定Uri物件
                    // 啟動修改聯絡人元件
                    // 設定準備選擇聯絡人的URI物件
                    // 設定Action名稱為選擇
                    // 設定Uri物件
                    // 啟動選擇聯絡人元件
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
        // 如果啟動的元件操作成功
            // 新增聯絡人
            // 修改聯絡人
            // 選擇聯絡人
    }
    
}
