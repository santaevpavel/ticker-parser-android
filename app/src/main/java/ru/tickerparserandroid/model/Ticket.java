package ru.tickerparserandroid.model;

import android.net.Uri;

import java.util.Date;
import java.util.List;

public class Ticket {

    private Uri photo;
    private Date date;
    private int inn;
    private int total;

    private List<TicketItem> items;

    public Ticket() {
    }

    public Ticket(Uri photo, Date date, int inn, int total, List<TicketItem> items) {
        this.photo = photo;
        this.date = date;
        this.inn = inn;
        this.total = total;
        this.items = items;
    }

    public Uri getPhoto() {
        return photo;
    }

    public void setPhoto(Uri photo) {
        this.photo = photo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TicketItem> getItems() {
        return items;
    }

    public void setItems(List<TicketItem> items) {
        this.items = items;
    }
}
