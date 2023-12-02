package com.example.e_buystart;

public class items_recycle {
     String item_text;
     int item_img1;
    int item_img2;

    int item_img3;

    public items_recycle(String item_text, int item_img1, int item_img2, int item_img3) {
        this.item_text = item_text;
        this.item_img1 = item_img1;
        this.item_img2 = item_img2;
        this.item_img3 = item_img3;
    }

    public String getItem_text() {
        return item_text;
    }

    public void setItem_text(String item_text) {
        this.item_text = item_text;
    }

    public int getItem_img1() {
        return item_img1;
    }

    public void setItem_img1(int item_img1) {
        this.item_img1 = item_img1;
    }

    public int getItem_img2() {
        return item_img2;
    }

    public void setItem_img2(int item_img2) {
        this.item_img2 = item_img2;
    }

    public int getItem_img3() {
        return item_img3;
    }

    public void setItem_img3(int item_img3) {
        this.item_img3 = item_img3;
    }
}
