package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryDetailsResponse {

    /**
     * data : {"id":1,"name":"Gallery 1","category":{"id":8,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709577f8.jpg","name":"Sport & Outdoor","number_of_arts":0},"images":[{"id":8,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224870012.jpg"},{"id":9,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224753007.jpg"},{"id":10,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/156422490902.jpg"}]}
     * status : true
     * message : Success
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        /**
         * id : 1
         * name : Gallery 1
         * category : {"id":8,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709577f8.jpg","name":"Sport & Outdoor","number_of_arts":0}
         * images : [{"id":8,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224870012.jpg"},{"id":9,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/1564224753007.jpg"},{"id":10,"subtitle_text":"World Fashion","photo":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/sliders/156422490902.jpg"}]
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("category")
        private CategoryBean category;
        @SerializedName("images")
        private List<ImagesBean> images;

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

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
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

        public static class ImagesBean {
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
