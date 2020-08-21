package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleriesResponse {

    /**
     * data : [{"id":1,"name":"Gallery 1","category":{"id":8,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709577f8.jpg","name":"Sport & Outdoor","number_of_arts":0},"cover":{"id":8,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224870012.jpg"}},{"id":2,"name":"Gallery 2","category":{"id":10,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709067f3.jpg","name":"Health & Beauty","number_of_arts":0},"cover":{"id":8,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224870012.jpg"}}]
     * status : true
     * message :
     */

    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<DataBean> data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * name : Gallery 1
         * category : {"id":8,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709577f8.jpg","name":"Sport & Outdoor","number_of_arts":0}
         * cover : {"id":8,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224870012.jpg"}
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("category")
        private CategoryBean category;
        @SerializedName("cover")
        private CoverBean cover;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CategoryBean getCategory() {
            return category;
        }

        public void setCategory(CategoryBean category) {
            this.category = category;
        }

        public CoverBean getCover() {
            return cover;
        }

        public void setCover(CoverBean cover) {
            this.cover = cover;
        }

        public static class CategoryBean {
            /**
             * id : 8
             * image : http://167.172.208.67/afaq-web/afaq-web/public/1568709577f8.jpg
             * name : Sport & Outdoor
             * number_of_arts : 0
             */

            @SerializedName("id")
            private int id;
            @SerializedName("image")
            private String image;
            @SerializedName("name")
            private String name;
            @SerializedName("number_of_arts")
            private int numberOfArts;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNumberOfArts() {
                return numberOfArts;
            }

            public void setNumberOfArts(int numberOfArts) {
                this.numberOfArts = numberOfArts;
            }
        }

        public static class CoverBean {
            /**
             * id : 8
             * subtitle_text : World Fashion
             * photo : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224870012.jpg
             */

            @SerializedName("id")
            private int id;
            @SerializedName("subtitle_text")
            private String subtitleText;
            @SerializedName("photo")
            private String photo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getSubtitleText() {
                return subtitleText;
            }

            public void setSubtitleText(String subtitleText) {
                this.subtitleText = subtitleText;
            }

            public String getPhoto() {
                return photo;
            }

            public void setPhoto(String photo) {
                this.photo = photo;
            }
        }
    }
}
