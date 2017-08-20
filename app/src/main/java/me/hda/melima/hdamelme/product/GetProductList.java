package me.hda.melima.hdamelme.product;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetProductList {
    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("Price")
    @Expose
    private Integer price;

    @SerializedName("CountAvailable")
    @Expose
    private Integer countAvailable;

    @SerializedName("DiscountPercent")
    @Expose
    private Integer discountPercent;

    @SerializedName("Description")
    @Expose
    private String description;

    @SerializedName("SerialNumber")
    @Expose
    private String serialNumber;

    @SerializedName("id")
    @Expose
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCountAvailable() {
        return countAvailable;
    }

    public void setCountAvailable(Integer countAvailable) {
        this.countAvailable = countAvailable;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
