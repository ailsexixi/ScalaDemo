import kafka.metrics.KafkaMetricsReporter;
import kafka.server.KafkaConfig;
import kafka.server.KafkaServer;
import org.apache.kafka.common.utils.Time;
import scala.Option;
import scala.collection.mutable.ArrayBuffer;


import java.util.Properties;

/**
 * Author: LiuCaiLiang
 * Desc:
 * Date: 2021/12/3
 */
public class TTT {
    public static void main(String[] args) {
        String a = "val inv_date_sk = StructField(\"inv_date_sk\",LongType)                            \n" +
                "val inv_item_sk = StructField(\"inv_item_sk\",LongType)                            \n" +
                "val inv_warehouse_sk = StructField(\"inv_warehouse_sk\",LongType)                       \n" +
                "val inv_quantity_on_hand = StructField(\"inv_quantity_on_hand\",IntegerType)  ";
        String[] array = a.split("\\n");
        StringBuffer buffer = new StringBuffer();
        buffer.append("val struct = StructType(Array(");
        for (String s : array) {
            String[] split = s.split("=");
            String[] split1 = split[0].split(" ");
            buffer.append(split1[1] + ",");
            }
        System.out.println(buffer);

        Properties brokerConfig = new Properties();

          brokerConfig.setProperty("broker.id", "1");
          brokerConfig.setProperty("host.name", "");
          brokerConfig.setProperty("port", String.valueOf(8790));
          brokerConfig.setProperty("log.dirs", "");
          brokerConfig.setProperty("log.flush.interval.messages", String.valueOf(1));

        KafkaServer kafkaServer = new KafkaServer(KafkaConfig.fromProps(brokerConfig), Time.SYSTEM, Option.apply("asdak"), false);


        }

    }
