package org.crazyit.app.domain;

/**
 * Created by 010200022422 on 2017/7/25.
 */
public class Cscf1SVehicletreeEntity {
    private int id;
    private int pId;
    private String name;
    private Byte open;
    private String icon;
    private Integer leibie;
    private Integer xiangmuid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getOpen() {
        return open;
    }

    public void setOpen(Byte open) {
        this.open = open;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getLeibie() {
        return leibie;
    }

    public void setLeibie(Integer leibie) {
        this.leibie = leibie;
    }

    public Integer getXiangmuid() {
        return xiangmuid;
    }

    public void setXiangmuid(Integer xiangmuid) {
        this.xiangmuid = xiangmuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cscf1SVehicletreeEntity that = (Cscf1SVehicletreeEntity) o;

        if (id != that.id) return false;
        if (pId != that.pId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (open != null ? !open.equals(that.open) : that.open != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (leibie != null ? !leibie.equals(that.leibie) : that.leibie != null) return false;
        if (xiangmuid != null ? !xiangmuid.equals(that.xiangmuid) : that.xiangmuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + pId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (open != null ? open.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (leibie != null ? leibie.hashCode() : 0);
        result = 31 * result + (xiangmuid != null ? xiangmuid.hashCode() : 0);
        return result;
    }
}
