package lab3.Clothes;

public abstract class Clothes {
    private String manufacture;
    private String material;
    private int size;
    private String article;
    private String color;


    public Clothes() {
    } // конструктор по умолчанию


    public Clothes(String manufacture, int size, String article, String color) {
        this.manufacture = manufacture;
        this.size = size;
        this.article = article;
        this.color = color;

    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }


    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass()!= o.getClass())
        {
            return false;
        }
        Clothes Blouse =(Clothes)o;
        return(this.getManufacture().equals(Blouse.getManufacture()) && this.getSize()==Blouse.getSize());
    }


    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + ( article != null ? article.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Clothes" +"\t"+
                "Manufacture" +"\t"+ getManufacture() +"\t"+
                "Size" + getSize() +"\t"+
                "Article" + "\t"+  getArticle() +"\t"+
                "Color" + "\t"+ getColor() +"\t"+
                "} ";
    }
}
