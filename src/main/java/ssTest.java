import java.util.HashMap;

/**
 * Author: LiuCaiLiang
 * Desc:
 * Date: 2021/12/2
 */
public class ssTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
//        for ((key, value) <- map) {
//            if (!"rowkey".equals(key)) {
//            }
//        }
        String a = "promotion\n" +
                "StructField(\"p_promo_sk\",bigint)                             \n" +
                "StructField(\"p_promo_id\",char(16))                           \n" +
                "StructField(\"p_start_date_sk\",bigint)                        \n" +
                "StructField(\"p_end_date_sk\",bigint)                          \n" +
                "StructField(\"p_item_sk\",bigint)                              \n" +
                "StructField(\"p_cost\",decimal(15)2))                          \n" +
                "StructField(\"p_response_target\",int)                         \n" +
                "StructField(\"p_promo_name\",char(50))                         \n" +
                "StructField(\"p_channel_dmail\",char(1))                       \n" +
                "StructField(\"p_channel_email\",char(1))                       \n" +
                "StructField(\"p_channel_catalog\",char(1))                     \n" +
                "StructField(\"p_channel_tv\",char(1))                          \n" +
                "StructField(\"p_channel_radio\",char(1))                       \n" +
                "StructField(\"p_channel_press\",char(1))                       \n" +
                "StructField(\"p_channel_event\",char(1))                       \n" +
                "StructField(\"p_channel_demo\",char(1))                        \n" +
                "StructField(\"p_channel_details\",varchar(100))                \n" +
                "StructField(\"p_purpose\",char(15))                            \n" +
                "StructField(\"p_discount_active\",char(1))        \n" +
                "\n" +
                "warehouse\n" +
                "StructField(\"w_warehouse_sk\",bigint)                         \n" +
                "StructField(\"w_warehouse_id\",char(16))                       \n" +
                "StructField(\"w_warehouse_name\",varchar(20))                  \n" +
                "StructField(\"w_warehouse_sq_ft\",int)                         \n" +
                "StructField(\"w_street_number\",char(10))                      \n" +
                "StructField(\"w_street_name\",varchar(60))                     \n" +
                "StructField(\"w_street_type\",char(15))                        \n" +
                "StructField(\"w_suite_number\",char(10))                       \n" +
                "StructField(\"w_city\",varchar(60))                            \n" +
                "StructField(\"w_county\",varchar(30))                          \n" +
                "StructField(\"w_state\",char(2))                               \n" +
                "StructField(\"w_zip\",char(10))                                \n" +
                "StructField(\"w_country\",varchar(20))                         \n" +
                "StructField(\"w_gmt_offset\",decimal(5)2))        \n" +
                "\n" +
                "ship_mode\n" +
                "StructField(\"sm_ship_mode_sk\",bigint)                        \n" +
                "StructField(\"sm_ship_mode_id\",char(16))                      \n" +
                "StructField(\"sm_type\",char(30))                              \n" +
                "StructField(\"sm_code\",char(10))                              \n" +
                "StructField(\"sm_carrier\",char(20))                           \n" +
                "StructField(\"sm_contract\",char(20))       \n" +
                "\n" +
                "reason\n" +
                "StructField(\"r_reason_sk\",bigint)                            \n" +
                "StructField(\"r_reason_id\",char(16))                          \n" +
                "StructField(\"r_reason_desc\",char(100))     \n" +
                "\n" +
                "income_band\n" +
                "StructField(\"ib_income_band_sk\",bigint)                      \n" +
                "StructField(\"ib_lower_bound\",int)                            \n" +
                "StructField(\"ib_upper_bound\",int)     \n" +
                "\n" +
                "call_center\n" +
                "StructField(\"cc_call_center_sk\",bigint)                      \n" +
                "StructField(\"cc_call_center_id\",char(16))                    \n" +
                "StructField(\"cc_rec_start_date\",date)                        \n" +
                "StructField(\"cc_rec_end_date\",date)                          \n" +
                "StructField(\"cc_closed_date_sk\",bigint)                      \n" +
                "StructField(\"cc_open_date_sk\",bigint)                        \n" +
                "StructField(\"cc_name\",varchar(50))                           \n" +
                "StructField(\"cc_class\",varchar(50))                          \n" +
                "StructField(\"cc_employees\",int)                              \n" +
                "StructField(\"cc_sq_ft\",int)                                  \n" +
                "StructField(\"cc_hours\",char(20))                             \n" +
                "StructField(\"cc_manager\",varchar(40))                        \n" +
                "StructField(\"cc_mkt_id\",int)                                 \n" +
                "StructField(\"cc_mkt_class\",char(50))                         \n" +
                "StructField(\"cc_mkt_desc\",varchar(100))                      \n" +
                "StructField(\"cc_market_manager\",varchar(40))                 \n" +
                "StructField(\"cc_division\",int)                               \n" +
                "StructField(\"cc_division_name\",varchar(50))                  \n" +
                "StructField(\"cc_company\",int)                                \n" +
                "StructField(\"cc_company_name\",char(50))                      \n" +
                "StructField(\"cc_street_number\",char(10))                     \n" +
                "StructField(\"cc_street_name\",varchar(60))                    \n" +
                "StructField(\"cc_street_type\",char(15))                       \n" +
                "StructField(\"cc_suite_number\",char(10))                      \n" +
                "StructField(\"cc_city\",varchar(60))                           \n" +
                "StructField(\"cc_county\",varchar(30))                         \n" +
                "StructField(\"cc_state\",char(2))                              \n" +
                "StructField(\"cc_zip\",char(10))                               \n" +
                "StructField(\"cc_country\",varchar(20))                        \n" +
                "StructField(\"cc_gmt_offset\",decimal(5)2))                    \n" +
                "StructField(\"cc_tax_percentage\",decimal(5)2))      \n" +
                "\n" +
                "web_page\n" +
                "StructField(\"wp_web_page_sk\",bigint)                         \n" +
                "StructField(\"wp_web_page_id\",char(16))                       \n" +
                "StructField(\"wp_rec_start_date\",date)                        \n" +
                "StructField(\"wp_rec_end_date\",date)                          \n" +
                "StructField(\"wp_creation_date_sk\",bigint)                    \n" +
                "StructField(\"wp_access_date_sk\",bigint)                      \n" +
                "StructField(\"wp_autogen_flag\",char(1))                       \n" +
                "StructField(\"wp_customer_sk\",bigint)                         \n" +
                "StructField(\"wp_url\",varchar(100))                           \n" +
                "StructField(\"wp_type\",char(50))                              \n" +
                "StructField(\"wp_char_count\",int)                             \n" +
                "StructField(\"wp_link_count\",int)                             \n" +
                "StructField(\"wp_image_count\",int)                            \n" +
                "StructField(\"wp_max_ad_count\",int)               \n" +
                "\n" +
                "catalog_page\n" +
                "StructField(\"cp_catalog_page_sk\",bigint)                     \n" +
                "StructField(\"cp_catalog_page_id\",char(16))                   \n" +
                "StructField(\"cp_start_date_sk\",bigint)                       \n" +
                "StructField(\"cp_end_date_sk\",bigint)                         \n" +
                "StructField(\"cp_department\",varchar(50))                     \n" +
                "StructField(\"cp_catalog_number\",int)                         \n" +
                "StructField(\"cp_catalog_page_number\",int)                    \n" +
                "StructField(\"cp_description\",varchar(100))                   \n" +
                "StructField(\"cp_type\",varchar(100))                    \n" +
                "\n" +
                "web_site\n" +
                "StructField(\"web_site_sk\",bigint)                            \n" +
                "StructField(\"web_site_id\",char(16))                          \n" +
                "StructField(\"web_rec_start_date\",date)                       \n" +
                "StructField(\"web_rec_end_date\",date)                         \n" +
                "StructField(\"web_name\",varchar(50))                          \n" +
                "StructField(\"web_open_date_sk\",bigint)                       \n" +
                "StructField(\"web_close_date_sk\",bigint)                      \n" +
                "StructField(\"web_class\",varchar(50))                         \n" +
                "StructField(\"web_manager\",varchar(40))                       \n" +
                "StructField(\"web_mkt_id\",int)                                \n" +
                "StructField(\"web_mkt_class\",varchar(50))                     \n" +
                "StructField(\"web_mkt_desc\",varchar(100))                     \n" +
                "StructField(\"web_market_manager\",varchar(40))                \n" +
                "StructField(\"web_company_id\",int)                            \n" +
                "StructField(\"web_company_name\",char(50))                     \n" +
                "StructField(\"web_street_number\",char(10))                    \n" +
                "StructField(\"web_street_name\",varchar(60))                   \n" +
                "StructField(\"web_street_type\",char(15))                      \n" +
                "StructField(\"web_suite_number\",char(10))                     \n" +
                "StructField(\"web_city\",varchar(60))                          \n" +
                "StructField(\"web_county\",varchar(30))                        \n" +
                "StructField(\"web_state\",char(2))                             \n" +
                "StructField(\"web_zip\",char(10))                              \n" +
                "StructField(\"web_country\",varchar(20))                       \n" +
                "StructField(\"web_gmt_offset\",decimal(5)2))                   \n" +
                "StructField(\"web_tax_percentage\",decimal(5)2))   \n" +
                "\n" +
                "store_sales\n" +
                "StructField(\"ss_sold_time_sk\",bigint)                        \n" +
                "StructField(\"ss_item_sk\",bigint)                             \n" +
                "StructField(\"ss_customer_sk\",bigint)                         \n" +
                "StructField(\"ss_cdemo_sk\",bigint)                            \n" +
                "StructField(\"ss_hdemo_sk\",bigint)                            \n" +
                "StructField(\"ss_addr_sk\",bigint)                             \n" +
                "StructField(\"ss_store_sk\",bigint)                            \n" +
                "StructField(\"ss_promo_sk\",bigint)                            \n" +
                "StructField(\"ss_ticket_number\",bigint)                       \n" +
                "StructField(\"ss_quantity\",int)                               \n" +
                "StructField(\"ss_wholesale_cost\",decimal(7)2))                \n" +
                "StructField(\"ss_list_price\",decimal(7)2))                    \n" +
                "StructField(\"ss_sales_price\",decimal(7)2))                   \n" +
                "StructField(\"ss_ext_discount_amt\",decimal(7)2))              \n" +
                "StructField(\"ss_ext_sales_price\",decimal(7)2))               \n" +
                "StructField(\"ss_ext_wholesale_cost\",decimal(7)2))            \n" +
                "StructField(\"ss_ext_list_price\",decimal(7)2))                \n" +
                "StructField(\"ss_ext_tax\",decimal(7)2))                       \n" +
                "StructField(\"ss_coupon_amt\",decimal(7)2))                    \n" +
                "StructField(\"ss_net_paid\",decimal(7)2))                      \n" +
                "StructField(\"ss_net_paid_inc_tax\",decimal(7)2))              \n" +
                "StructField(\"ss_net_profit\",decimal(7)2))                    \n" +
                "StructField(\"ss_sold_date_sk\",bigint)              \n" +
                "\n" +
                "store_returns\n" +
                "StructField(\"sr_return_time_sk\",bigint)                      \n" +
                "StructField(\"sr_item_sk\",bigint)                             \n" +
                "StructField(\"sr_customer_sk\",bigint)                         \n" +
                "StructField(\"sr_cdemo_sk\",bigint)                            \n" +
                "StructField(\"sr_hdemo_sk\",bigint)                            \n" +
                "StructField(\"sr_addr_sk\",bigint)                             \n" +
                "StructField(\"sr_store_sk\",bigint)                            \n" +
                "StructField(\"sr_reason_sk\",bigint)                           \n" +
                "StructField(\"sr_ticket_number\",bigint)                       \n" +
                "StructField(\"sr_return_quantity\",int)                        \n" +
                "StructField(\"sr_return_amt\",decimal(7)2))                    \n" +
                "StructField(\"sr_return_tax\",decimal(7)2))                    \n" +
                "StructField(\"sr_return_amt_inc_tax\",decimal(7)2))            \n" +
                "StructField(\"sr_fee\",decimal(7)2))                           \n" +
                "StructField(\"sr_return_ship_cost\",decimal(7)2))              \n" +
                "StructField(\"sr_refunded_cash\",decimal(7)2))                 \n" +
                "StructField(\"sr_reversed_charge\",decimal(7)2))               \n" +
                "StructField(\"sr_store_credit\",decimal(7)2))                  \n" +
                "StructField(\"sr_net_loss\",decimal(7)2))                      \n" +
                "StructField(\"sr_returned_date_sk\",bigint)        \n" +
                "\n" +
                "web_sales\n" +
                "StructField(\"ws_sold_time_sk\",bigint)                        \n" +
                "StructField(\"ws_ship_date_sk\",bigint)                        \n" +
                "StructField(\"ws_item_sk\",bigint)                             \n" +
                "StructField(\"ws_bill_customer_sk\",bigint)                    \n" +
                "StructField(\"ws_bill_cdemo_sk\",bigint)                       \n" +
                "StructField(\"ws_bill_hdemo_sk\",bigint)                       \n" +
                "StructField(\"ws_bill_addr_sk\",bigint)                        \n" +
                "StructField(\"ws_ship_customer_sk\",bigint)                    \n" +
                "StructField(\"ws_ship_cdemo_sk\",bigint)                       \n" +
                "StructField(\"ws_ship_hdemo_sk\",bigint)                       \n" +
                "StructField(\"ws_ship_addr_sk\",bigint)                        \n" +
                "StructField(\"ws_web_page_sk\",bigint)                         \n" +
                "StructField(\"ws_web_site_sk\",bigint)                         \n" +
                "StructField(\"ws_ship_mode_sk\",bigint)                        \n" +
                "StructField(\"ws_warehouse_sk\",bigint)                        \n" +
                "StructField(\"ws_promo_sk\",bigint)                            \n" +
                "StructField(\"ws_order_number\",bigint)                        \n" +
                "StructField(\"ws_quantity\",int)                               \n" +
                "StructField(\"ws_wholesale_cost\",decimal(7)2))                \n" +
                "StructField(\"ws_list_price\",decimal(7)2))                    \n" +
                "StructField(\"ws_sales_price\",decimal(7)2))                   \n" +
                "StructField(\"ws_ext_discount_amt\",decimal(7)2))              \n" +
                "StructField(\"ws_ext_sales_price\",decimal(7)2))               \n" +
                "StructField(\"ws_ext_wholesale_cost\",decimal(7)2))            \n" +
                "StructField(\"ws_ext_list_price\",decimal(7)2))                \n" +
                "StructField(\"ws_ext_tax\",decimal(7)2))                       \n" +
                "StructField(\"ws_coupon_amt\",decimal(7)2))                    \n" +
                "StructField(\"ws_ext_ship_cost\",decimal(7)2))                 \n" +
                "StructField(\"ws_net_paid\",decimal(7)2))                      \n" +
                "StructField(\"ws_net_paid_inc_tax\",decimal(7)2))              \n" +
                "StructField(\"ws_net_paid_inc_ship\",decimal(7)2))             \n" +
                "StructField(\"ws_net_paid_inc_ship_tax\",decimal(7)2))         \n" +
                "StructField(\"ws_net_profit\",decimal(7)2))                    \n" +
                "StructField(\"ws_sold_date_sk\",bigint)               \n" +
                "\n" +
                "web_returns\n" +
                "StructField(\"wr_returned_time_sk\",bigint)                    \n" +
                "StructField(\"wr_item_sk\",bigint)                             \n" +
                "StructField(\"wr_refunded_customer_sk\",bigint)                \n" +
                "StructField(\"wr_refunded_cdemo_sk\",bigint)                   \n" +
                "StructField(\"wr_refunded_hdemo_sk\",bigint)                   \n" +
                "StructField(\"wr_refunded_addr_sk\",bigint)                    \n" +
                "StructField(\"wr_returning_customer_sk\",bigint)               \n" +
                "StructField(\"wr_returning_cdemo_sk\",bigint)                  \n" +
                "StructField(\"wr_returning_hdemo_sk\",bigint)                  \n" +
                "StructField(\"wr_returning_addr_sk\",bigint)                   \n" +
                "StructField(\"wr_web_page_sk\",bigint)                         \n" +
                "StructField(\"wr_reason_sk\",bigint)                           \n" +
                "StructField(\"wr_order_number\",bigint)                        \n" +
                "StructField(\"wr_return_quantity\",int)                        \n" +
                "StructField(\"wr_return_amt\",decimal(7)2))                    \n" +
                "StructField(\"wr_return_tax\",decimal(7)2))                    \n" +
                "StructField(\"wr_return_amt_inc_tax\",decimal(7)2))            \n" +
                "StructField(\"wr_fee\",decimal(7)2))                           \n" +
                "StructField(\"wr_return_ship_cost\",decimal(7)2))              \n" +
                "StructField(\"wr_refunded_cash\",decimal(7)2))                 \n" +
                "StructField(\"wr_reversed_charge\",decimal(7)2))               \n" +
                "StructField(\"wr_account_credit\",decimal(7)2))                \n" +
                "StructField(\"wr_net_loss\",decimal(7)2))                      \n" +
                "StructField(\"wr_returned_date_sk\",bigint)             \n" +
                "\n" +
                "catalog_sales\n" +
                "StructField(\"cs_sold_time_sk\",bigint)                        \n" +
                "StructField(\"cs_ship_date_sk\",bigint)                        \n" +
                "StructField(\"cs_bill_customer_sk\",bigint)                    \n" +
                "StructField(\"cs_bill_cdemo_sk\",bigint)                       \n" +
                "StructField(\"cs_bill_hdemo_sk\",bigint)                       \n" +
                "StructField(\"cs_bill_addr_sk\",bigint)                        \n" +
                "StructField(\"cs_ship_customer_sk\",bigint)                    \n" +
                "StructField(\"cs_ship_cdemo_sk\",bigint)                       \n" +
                "StructField(\"cs_ship_hdemo_sk\",bigint)                       \n" +
                "StructField(\"cs_ship_addr_sk\",bigint)                        \n" +
                "StructField(\"cs_call_center_sk\",bigint)                      \n" +
                "StructField(\"cs_catalog_page_sk\",bigint)                     \n" +
                "StructField(\"cs_ship_mode_sk\",bigint)                        \n" +
                "StructField(\"cs_warehouse_sk\",bigint)                        \n" +
                "StructField(\"cs_item_sk\",bigint)                             \n" +
                "StructField(\"cs_promo_sk\",bigint)                            \n" +
                "StructField(\"cs_order_number\",bigint)                        \n" +
                "StructField(\"cs_quantity\",int)                               \n" +
                "StructField(\"cs_wholesale_cost\",decimal(7)2))                \n" +
                "StructField(\"cs_list_price\",decimal(7)2))                    \n" +
                "StructField(\"cs_sales_price\",decimal(7)2))                   \n" +
                "StructField(\"cs_ext_discount_amt\",decimal(7)2))              \n" +
                "StructField(\"cs_ext_sales_price\",decimal(7)2))               \n" +
                "StructField(\"cs_ext_wholesale_cost\",decimal(7)2))            \n" +
                "StructField(\"cs_ext_list_price\",decimal(7)2))                \n" +
                "StructField(\"cs_ext_tax\",decimal(7)2))                       \n" +
                "StructField(\"cs_coupon_amt\",decimal(7)2))                    \n" +
                "StructField(\"cs_ext_ship_cost\",decimal(7)2))                 \n" +
                "StructField(\"cs_net_paid\",decimal(7)2))                      \n" +
                "StructField(\"cs_net_paid_inc_tax\",decimal(7)2))              \n" +
                "StructField(\"cs_net_paid_inc_ship\",decimal(7)2))             \n" +
                "StructField(\"cs_net_paid_inc_ship_tax\",decimal(7)2))         \n" +
                "StructField(\"cs_net_profit\",decimal(7)2))                    \n" +
                "StructField(\"cs_sold_date_sk\",bigint)           \n" +
                "\n" +
                "catalog_returns\n" +
                "StructField(\"cr_returned_time_sk\",bigint)                    \n" +
                "StructField(\"cr_item_sk\",bigint)                             \n" +
                "StructField(\"cr_refunded_customer_sk\",bigint)                \n" +
                "StructField(\"cr_refunded_cdemo_sk\",bigint)                   \n" +
                "StructField(\"cr_refunded_hdemo_sk\",bigint)                   \n" +
                "StructField(\"cr_refunded_addr_sk\",bigint)                    \n" +
                "StructField(\"cr_returning_customer_sk\",bigint)               \n" +
                "StructField(\"cr_returning_cdemo_sk\",bigint)                  \n" +
                "StructField(\"cr_returning_hdemo_sk\",bigint)                  \n" +
                "StructField(\"cr_returning_addr_sk\",bigint)                   \n" +
                "StructField(\"cr_call_center_sk\",bigint)                      \n" +
                "StructField(\"cr_catalog_page_sk\",bigint)                     \n" +
                "StructField(\"cr_ship_mode_sk\",bigint)                        \n" +
                "StructField(\"cr_warehouse_sk\",bigint)                        \n" +
                "StructField(\"cr_reason_sk\",bigint)                           \n" +
                "StructField(\"cr_order_number\",bigint)                        \n" +
                "StructField(\"cr_return_quantity\",int)                        \n" +
                "StructField(\"cr_return_amount\",decimal(7)2))                 \n" +
                "StructField(\"cr_return_tax\",decimal(7)2))                    \n" +
                "StructField(\"cr_return_amt_inc_tax\",decimal(7)2))            \n" +
                "StructField(\"cr_fee\",decimal(7)2))                           \n" +
                "StructField(\"cr_return_ship_cost\",decimal(7)2))              \n" +
                "StructField(\"cr_refunded_cash\",decimal(7)2))                 \n" +
                "StructField(\"cr_reversed_charge\",decimal(7)2))               \n" +
                "StructField(\"cr_store_credit\",decimal(7)2))                  \n" +
                "StructField(\"cr_net_loss\",decimal(7)2))                      \n" +
                "StructField(\"cr_returned_date_sk\",bigint)         \n" +
                "\n" +
                "inventory\n" +
                "StructField(\"inv_date_sk\",bigint)                            \n" +
                "StructField(\"inv_item_sk\",bigint)                            \n" +
                "StructField(\"inv_warehouse_sk\",bigint)                       \n" +
                "StructField(\"inv_quantity_on_hand\",int)               ";
        String[] array = a.split("\\n");
        for (String s : array) {
            String[] split = s.split("\"");
            if(split.length == 1){
                System.out.println(s);
            }else {
                System.out.println("val " + split[1] + " = " + s);
            }
        }

    }
}
