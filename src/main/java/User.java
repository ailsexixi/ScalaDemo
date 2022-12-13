/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class User {
    private String id ;
    private String name ;
    private Integer age ;

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
//    public static class Builder{
        private String id ;
        private String name ;
        private Integer age ;

        public Builder id(String id) {
            this.id = id ;
            return this;
        }

        public Builder name(String name) {
            this.name = name ;
            return this ;
        }

        public Builder age(Integer age) {
            this.age = age ;
            return this;
        }

        public User build() {
            return new User(this);
        }

        public User build2() {
            return new User(this.id , this.name , this.age);
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
        super();
    }

    public User(String id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name ;
        this.age = builder.age;
    }

}
