import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: LiuCaiLiang
 * Desc:
 * Date: 2021/10/15
 */
public class JsonTest {

    public static void main(String[] args) {
        String js = "{\n" +
                "\t\"state\": \"open\",\n" +
                "\t\"settings\": {\n" +
                "\t\t\"index\": {\n" +
                "\t\t\t\"mapping\": {\n" +
                "\t\t\t\t\"total_fields\": {\n" +
                "\t\t\t\t\t\"limit\": \"2048\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"refresh_interval\": \"30s\",\n" +
                "\t\t\t\"number_of_shards\": \"1\",\n" +
                "\t\t\t\"translog\": {\n" +
                "\t\t\t\t\"flush_threshold_size\": \"2g\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"provided_name\": \"mpi_person_basics\",\n" +
                "\t\t\t\"max_result_window\": \"1000000\",\n" +
                "\t\t\t\"creation_date\": \"1631900268995\",\n" +
                "\t\t\t\"number_of_replicas\": \"1\",\n" +
                "\t\t\t\"uuid\": \"AkIbuqFAREmcCvoI1UVlMA\",\n" +
                "\t\t\t\"version\": {\n" +
                "\t\t\t\t\"created\": \"6080899\"\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"mappings\": {\n" +
                "\t\t\"_doc\": {\n" +
                "\t\t\t\"dynamic\": \"true\",\n" +
                "\t\t\t\"_source\": {\n" +
                "\t\t\t\t\"includes\": []\n" +
                "\t\t\t},\n" +
                "\t\t\t\"properties\": {\n" +
                "\t\t\t\t\"birthday\": {\n" +
                "\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\"ignore_above\": 256,\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"document_place_name\": {\n" +
                "\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\"ignore_above\": 256,\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"gender\": {\n" +
                "\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\"ignore_above\": 256,\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"aliases\": [],\n" +
                "\t\"primary_terms\": {\n" +
                "\t\t\"0\": 1\n" +
                "\t},\n" +
                "\t\"in_sync_allocations\": {\n" +
                "\t\t\"0\": [\n" +
                "\t\t\t\"BvTlsO1JRUu8aaKJPjgO9w\",\n" +
                "\t\t\t\"_v5E9CLuT7uppup0VsKLpw\"\n" +
                "\t\t]\n" +
                "\t}\n" +
                "}";
        String b = "  {\n" +
                "    \"birthday\": {\n" +
                "      \"type\": \"text\",\n" +
                "      \"fields\": {\n" +
                "        \"keyword\": {\n" +
                "          \"ignore_above\": 256,\n" +
                "          \"type\": \"keyword\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"document_place_name\": {\n" +
                "      \"type\": \"text\",\n" +
                "      \"fields\": {\n" +
                "        \"keyword\": {\n" +
                "          \"ignore_above\": 256,\n" +
                "          \"type\": \"keyword\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"gender\": {\n" +
                "      \"type\": \"text\",\n" +
                "      \"fields\": {\n" +
                "        \"keyword\": {\n" +
                "          \"ignore_above\": 256,\n" +
                "          \"type\": \"keyword\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }";
        String str = "{\n" +
                "\t\"state\": \"open\",\n" +
                "\t\"settings\": {\n" +
                "\t\t\"index\": {\n" +
                "\t\t\t\"mapping\": {\n" +
                "\t\t\t\t\"total_fields\": {\n" +
                "\t\t\t\t\t\"limit\": \"2048\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"refresh_interval\": \"30s\",\n" +
                "\t\t\t\"number_of_shards\": \"1\",\n" +
                "\t\t\t\"translog\": {\n" +
                "\t\t\t\t\"flush_threshold_size\": \"2g\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"provided_name\": \"mpi_person_basics\",\n" +
                "\t\t\t\"max_result_window\": \"1000000\",\n" +
                "\t\t\t\"creation_date\": \"1631900268995\",\n" +
                "\t\t\t\"number_of_replicas\": \"1\",\n" +
                "\t\t\t\"uuid\": \"AkIbuqFAREmcCvoI1UVlMA\",\n" +
                "\t\t\t\"version\": {\n" +
                "\t\t\t\t\"created\": \"6080899\"\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"mappings\": {\n" +
                "\t\t\"_doc\": {\n" +
                "\t\t\t\"dynamic\": \"true\",\n" +
                "\t\t\t\"_source\": {\n" +
                "\t\t\t\t\"includes\": []\n" +
                "\t\t\t},\n" +
                "\t\t\t\"properties\": {\n" +
                "\t\t\t\t\"birthday\": {\n" +
                "\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\"ignore_above\": 256,\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"document_place_name\": {\n" +
                "\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\"ignore_above\": 256,\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"gender\": {\n" +
                "\t\t\t\t\t\"type\": \"text\",\n" +
                "\t\t\t\t\t\"fields\": {\n" +
                "\t\t\t\t\t\t\"keyword\": {\n" +
                "\t\t\t\t\t\t\t\"ignore_above\": 256,\n" +
                "\t\t\t\t\t\t\t\"type\": \"keyword\"\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"aliases\": [],\n" +
                "\t\"primary_terms\": {\n" +
                "\t\t\"0\": 1\n" +
                "\t},\n" +
                "\t\"in_sync_allocations\": {\n" +
                "\t\t\"0\": [\n" +
                "\t\t\t\"BvTlsO1JRUu8aaKJPjgO9w\",\n" +
                "\t\t\t\"_v5E9CLuT7uppup0VsKLpw\"\n" +
                "\t\t]\n" +
                "\t}\n" +
                "}";

        String key = "mappings._doc.properties";
        JSONObject jsonObject = JSONObject.parseObject(getString(str,key));
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.print("key值=" + entry.getKey());
            JSONObject ss = JSONObject.parseObject(entry.getValue().toString());
            System.out.println(",value: " + ss.get("type"));
            replaceJson(str,entry.getKey(),ss.get("type").toString());
        }
    }

    public static String getString(String str, String key) {
        String[] split = key.split("\\.");
        if (split.length > 1) {
            for (String s : split) {
                String targetKey = key.substring(key.indexOf(".") + 1);
                JSONObject jsonObject = JSONObject.parseObject(str);
                String string = jsonObject.getString(s);
                return getString(string, targetKey);
            }
        }
        JSONObject jsonObject = JSONObject.parseObject(str);
        return jsonObject.getString(key);
    }

    public static String replaceJson (String json, String fieldName,String fieldType){
        JSONObject kindJson = JSONObject.parseObject(json);
        String mappings =kindJson.getString("mappings");//获取到menus
        JSONObject mappingsJson = JSONObject.parseObject(mappings);
        String doc=mappingsJson.getString("_doc");//获取到menus
        JSONObject docJson = JSONObject.parseObject(doc);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("fieldName",fieldName);
        hashMap.put("fieldType",fieldType);
        docJson.put("properties",hashMap);
        mappingsJson.put("_doc",docJson);
        kindJson.put("mappings",mappingsJson);
//        System.out.println(kindJson);
        return kindJson.toString();
    }
}
