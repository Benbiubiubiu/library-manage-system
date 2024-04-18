package com.ben.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Borrow {
    int id;
    int sid;
    int bid;
    Date time;
    String bookName;
    String studentName;
}
