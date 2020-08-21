package com.mahmoudsaad.xarkas.data.network.pojo;

import java.util.List;

public class OrderResponse {


    /**
     * data : {"order":{"id":88,"user_id":"6","method":"cod","user_name":"man","city":"32","street_name":"jksldfa","phone_number":"3232","building_number":"32","flat_number":"32","totalQty":1,"created_at":"30 Mar, 2020","order_number":88,"total_price":"32.0","status":"pending","art":{"id":86,"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png","likes_count":0,"is_featured":1,"is_favorite":false,"user":{"id":106,"fullname":"Dr. Lynn Homenick IV","email":"connelly.jannie@example.org","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/default.png","country_id":null,"city_id":null,"phone":"(402) 785-9292","type":"artist","address":null,"is_followed":false},"price":1208,"lang":"en"}},"art":{"id":86,"category_id":8,"artist_id":106,"price":1208,"amount":0,"is_featured":1,"likes_count":0,"flag":"","thumbnail":"default.png","created_at":"2020-03-05 15:45:27","updated_at":"2020-03-30 14:39:15","youtube_link":"https://www.youtube.com/watch?v=UFHt-tbBG98","translations":[{"id":171,"name":"minima","description":"a3tNcN8ejGxDQyGQjMSahzAJzYaeJeiPkkbmjqF4D778uLFi8Y","art_id":86,"specifications":"ixg7Ch5AbAstg4QRVllY4jwpDyQBnexdg8HVbKXjaSP3D539Bp","locale":"ar"},{"id":172,"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","art_id":86,"specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q","locale":"en"}],"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q"}}
     * status : true
     * message : Success
     */

    private DataBean data;
    private boolean status;
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
         * order : {"id":88,"user_id":"6","method":"cod","user_name":"man","city":"32","street_name":"jksldfa","phone_number":"3232","building_number":"32","flat_number":"32","totalQty":1,"created_at":"30 Mar, 2020","order_number":88,"total_price":"32.0","status":"pending","art":{"id":86,"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png","likes_count":0,"is_featured":1,"is_favorite":false,"user":{"id":106,"fullname":"Dr. Lynn Homenick IV","email":"connelly.jannie@example.org","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/default.png","country_id":null,"city_id":null,"phone":"(402) 785-9292","type":"artist","address":null,"is_followed":false},"price":1208,"lang":"en"}}
         * art : {"id":86,"category_id":8,"artist_id":106,"price":1208,"amount":0,"is_featured":1,"likes_count":0,"flag":"","thumbnail":"default.png","created_at":"2020-03-05 15:45:27","updated_at":"2020-03-30 14:39:15","youtube_link":"https://www.youtube.com/watch?v=UFHt-tbBG98","translations":[{"id":171,"name":"minima","description":"a3tNcN8ejGxDQyGQjMSahzAJzYaeJeiPkkbmjqF4D778uLFi8Y","art_id":86,"specifications":"ixg7Ch5AbAstg4QRVllY4jwpDyQBnexdg8HVbKXjaSP3D539Bp","locale":"ar"},{"id":172,"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","art_id":86,"specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q","locale":"en"}],"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q"}
         */

        private OrderBean order;
        private ArtBeanX art;

        public OrderBean getOrder() {
            return order;
        }

        public void setOrder(OrderBean order) {
            this.order = order;
        }

        public ArtBeanX getArt() {
            return art;
        }

        public void setArt(ArtBeanX art) {
            this.art = art;
        }

        public static class OrderBean {
            /**
             * id : 88
             * user_id : 6
             * method : cod
             * user_name : man
             * city : 32
             * street_name : jksldfa
             * phone_number : 3232
             * building_number : 32
             * flat_number : 32
             * totalQty : 1
             * created_at : 30 Mar, 2020
             * order_number : 88
             * total_price : 32.0
             * status : pending
             * art : {"id":86,"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png","likes_count":0,"is_featured":1,"is_favorite":false,"user":{"id":106,"fullname":"Dr. Lynn Homenick IV","email":"connelly.jannie@example.org","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/default.png","country_id":null,"city_id":null,"phone":"(402) 785-9292","type":"artist","address":null,"is_followed":false},"price":1208,"lang":"en"}
             */

            private int id;
            private String user_id;
            private String method;
            private String user_name;
            private String city;
            private String street_name;
            private String phone_number;
            private String building_number;
            private String flat_number;
            private int totalQty;
            private String created_at;
            private int order_number;
            private String total_price;
            private String status;
            private ArtBean art;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getStreet_name() {
                return street_name;
            }

            public void setStreet_name(String street_name) {
                this.street_name = street_name;
            }

            public String getPhone_number() {
                return phone_number;
            }

            public void setPhone_number(String phone_number) {
                this.phone_number = phone_number;
            }

            public String getBuilding_number() {
                return building_number;
            }

            public void setBuilding_number(String building_number) {
                this.building_number = building_number;
            }

            public String getFlat_number() {
                return flat_number;
            }

            public void setFlat_number(String flat_number) {
                this.flat_number = flat_number;
            }

            public int getTotalQty() {
                return totalQty;
            }

            public void setTotalQty(int totalQty) {
                this.totalQty = totalQty;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public int getOrder_number() {
                return order_number;
            }

            public void setOrder_number(int order_number) {
                this.order_number = order_number;
            }

            public String getTotal_price() {
                return total_price;
            }

            public void setTotal_price(String total_price) {
                this.total_price = total_price;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public ArtBean getArt() {
                return art;
            }

            public void setArt(ArtBean art) {
                this.art = art;
            }

            public static class ArtBean {
                /**
                 * id : 86
                 * name : sit
                 * description : hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf
                 * specifications : rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q
                 * thumbnail : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png
                 * likes_count : 0
                 * is_featured : 1
                 * is_favorite : false
                 * user : {"id":106,"fullname":"Dr. Lynn Homenick IV","email":"connelly.jannie@example.org","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/default.png","country_id":null,"city_id":null,"phone":"(402) 785-9292","type":"artist","address":null,"is_followed":false}
                 * price : 1208
                 * lang : en
                 */

                private int id;
                private String name;
                private String description;
                private String specifications;
                private String thumbnail;
                private int likes_count;
                private int is_featured;
                private boolean is_favorite;
                private UserBean user;
                private int price;
                private String lang;

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

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getSpecifications() {
                    return specifications;
                }

                public void setSpecifications(String specifications) {
                    this.specifications = specifications;
                }

                public String getThumbnail() {
                    return thumbnail;
                }

                public void setThumbnail(String thumbnail) {
                    this.thumbnail = thumbnail;
                }

                public int getLikes_count() {
                    return likes_count;
                }

                public void setLikes_count(int likes_count) {
                    this.likes_count = likes_count;
                }

                public int getIs_featured() {
                    return is_featured;
                }

                public void setIs_featured(int is_featured) {
                    this.is_featured = is_featured;
                }

                public boolean isIs_favorite() {
                    return is_favorite;
                }

                public void setIs_favorite(boolean is_favorite) {
                    this.is_favorite = is_favorite;
                }

                public UserBean getUser() {
                    return user;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public String getLang() {
                    return lang;
                }

                public void setLang(String lang) {
                    this.lang = lang;
                }

                public static class UserBean {
                    /**
                     * id : 106
                     * fullname : Dr. Lynn Homenick IV
                     * email : connelly.jannie@example.org
                     * provider_id : null
                     * ban : 0
                     * image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/default.png
                     * country_id : null
                     * city_id : null
                     * phone : (402) 785-9292
                     * type : artist
                     * address : null
                     * is_followed : false
                     */

                    private int id;
                    private String fullname;
                    private String email;
                    private Object provider_id;
                    private int ban;
                    private String image;
                    private Object country_id;
                    private Object city_id;
                    private String phone;
                    private String type;
                    private Object address;
                    private boolean is_followed;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getFullname() {
                        return fullname;
                    }

                    public void setFullname(String fullname) {
                        this.fullname = fullname;
                    }

                    public String getEmail() {
                        return email;
                    }

                    public void setEmail(String email) {
                        this.email = email;
                    }

                    public Object getProvider_id() {
                        return provider_id;
                    }

                    public void setProvider_id(Object provider_id) {
                        this.provider_id = provider_id;
                    }

                    public int getBan() {
                        return ban;
                    }

                    public void setBan(int ban) {
                        this.ban = ban;
                    }

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public Object getCountry_id() {
                        return country_id;
                    }

                    public void setCountry_id(Object country_id) {
                        this.country_id = country_id;
                    }

                    public Object getCity_id() {
                        return city_id;
                    }

                    public void setCity_id(Object city_id) {
                        this.city_id = city_id;
                    }

                    public String getPhone() {
                        return phone;
                    }

                    public void setPhone(String phone) {
                        this.phone = phone;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public Object getAddress() {
                        return address;
                    }

                    public void setAddress(Object address) {
                        this.address = address;
                    }

                    public boolean isIs_followed() {
                        return is_followed;
                    }

                    public void setIs_followed(boolean is_followed) {
                        this.is_followed = is_followed;
                    }
                }
            }
        }

        public static class ArtBeanX {
            /**
             * id : 86
             * category_id : 8
             * artist_id : 106
             * price : 1208
             * amount : 0
             * is_featured : 1
             * likes_count : 0
             * flag :
             * thumbnail : default.png
             * created_at : 2020-03-05 15:45:27
             * updated_at : 2020-03-30 14:39:15
             * youtube_link : https://www.youtube.com/watch?v=UFHt-tbBG98
             * translations : [{"id":171,"name":"minima","description":"a3tNcN8ejGxDQyGQjMSahzAJzYaeJeiPkkbmjqF4D778uLFi8Y","art_id":86,"specifications":"ixg7Ch5AbAstg4QRVllY4jwpDyQBnexdg8HVbKXjaSP3D539Bp","locale":"ar"},{"id":172,"name":"sit","description":"hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf","art_id":86,"specifications":"rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q","locale":"en"}]
             * name : sit
             * description : hfOsDjKxl2bIcHmoG4XQx9DK3sH4BAw1N6aQVzUNUZ63makqzf
             * specifications : rCaNFWR9t9i4l2ppJ3ubtCgz9d6wRhr6SCWG1jskUrw6wkqq4Q
             */

            private int id;
            private int category_id;
            private int artist_id;
            private int price;
            private int amount;
            private int is_featured;
            private int likes_count;
            private String flag;
            private String thumbnail;
            private String created_at;
            private String updated_at;
            private String youtube_link;
            private String name;
            private String description;
            private String specifications;
            private List<TranslationsBean> translations;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public int getArtist_id() {
                return artist_id;
            }

            public void setArtist_id(int artist_id) {
                this.artist_id = artist_id;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public int getIs_featured() {
                return is_featured;
            }

            public void setIs_featured(int is_featured) {
                this.is_featured = is_featured;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public String getFlag() {
                return flag;
            }

            public void setFlag(String flag) {
                this.flag = flag;
            }

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getYoutube_link() {
                return youtube_link;
            }

            public void setYoutube_link(String youtube_link) {
                this.youtube_link = youtube_link;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getSpecifications() {
                return specifications;
            }

            public void setSpecifications(String specifications) {
                this.specifications = specifications;
            }

            public List<TranslationsBean> getTranslations() {
                return translations;
            }

            public void setTranslations(List<TranslationsBean> translations) {
                this.translations = translations;
            }

            public static class TranslationsBean {
                /**
                 * id : 171
                 * name : minima
                 * description : a3tNcN8ejGxDQyGQjMSahzAJzYaeJeiPkkbmjqF4D778uLFi8Y
                 * art_id : 86
                 * specifications : ixg7Ch5AbAstg4QRVllY4jwpDyQBnexdg8HVbKXjaSP3D539Bp
                 * locale : ar
                 */

                private int id;
                private String name;
                private String description;
                private int art_id;
                private String specifications;
                private String locale;

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

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getArt_id() {
                    return art_id;
                }

                public void setArt_id(int art_id) {
                    this.art_id = art_id;
                }

                public String getSpecifications() {
                    return specifications;
                }

                public void setSpecifications(String specifications) {
                    this.specifications = specifications;
                }

                public String getLocale() {
                    return locale;
                }

                public void setLocale(String locale) {
                    this.locale = locale;
                }
            }
        }
    }
}
