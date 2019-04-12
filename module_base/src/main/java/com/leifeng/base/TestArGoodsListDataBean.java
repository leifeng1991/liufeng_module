package com.leifeng.base;

public class TestArGoodsListDataBean {

    /**
     * id : 337
     * shop_id : 10
     * goods_ar_id : 279
     * title : 11
     * create_time : 1554723959
     * update_time : 1554723959
     * ord : 99
     * goods_ar : {"id":"279","title":"紫砂","shop_id":"10","ar_id":"5c4abb2e9f029","goods_id":"9519299","spec_people_id":"29","type":"1","url":"","foods_shop_id":"0","wiki_ar_id":"0"}
     */

    private String id;
    private String shop_id;
    private String goods_ar_id;
    private String title;
    private String create_time;
    private String update_time;
    private String ord;
    private GoodsArBean goods_ar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getGoods_ar_id() {
        return goods_ar_id;
    }

    public void setGoods_ar_id(String goods_ar_id) {
        this.goods_ar_id = goods_ar_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getOrd() {
        return ord;
    }

    public void setOrd(String ord) {
        this.ord = ord;
    }

    public GoodsArBean getGoods_ar() {
        return goods_ar;
    }

    public void setGoods_ar(GoodsArBean goods_ar) {
        this.goods_ar = goods_ar;
    }

    public static class GoodsArBean {
        /**
         * id : 279
         * title : 紫砂
         * shop_id : 10
         * ar_id : 5c4abb2e9f029
         * goods_id : 9519299
         * spec_people_id : 29
         * type : 1
         * url :
         * foods_shop_id : 0
         * wiki_ar_id : 0
         */

        private String id;
        private String title;
        private String shop_id;
        private String ar_id;
        private String goods_id;
        private String spec_people_id;
        private String type;
        private String url;
        private String foods_shop_id;
        private String wiki_ar_id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getAr_id() {
            return ar_id;
        }

        public void setAr_id(String ar_id) {
            this.ar_id = ar_id;
        }

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getSpec_people_id() {
            return spec_people_id;
        }

        public void setSpec_people_id(String spec_people_id) {
            this.spec_people_id = spec_people_id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getFoods_shop_id() {
            return foods_shop_id;
        }

        public void setFoods_shop_id(String foods_shop_id) {
            this.foods_shop_id = foods_shop_id;
        }

        public String getWiki_ar_id() {
            return wiki_ar_id;
        }

        public void setWiki_ar_id(String wiki_ar_id) {
            this.wiki_ar_id = wiki_ar_id;
        }
    }
}
