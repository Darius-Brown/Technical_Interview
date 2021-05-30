import java.io.Serializable;

public class beans {

    public class Album implements Serializable{
        private Integer id;
        private String artist;
        private String name;
        private long release_date;
        private double sales;
        private String genre;

        public Album(){};

        public String getName(){
            return this.name;
        }

        public void setName(){
            this.name = name;
        }

        public Integer getId(){
            return this.id;
        }

        public void setId(){
            this.id = id;
        }
    }
}
