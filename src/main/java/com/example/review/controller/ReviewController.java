package com.example.review.controller;


import com.example.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/review")
public class ReviewController {

    /** 인젝션 주입 */
    @Autowired
    ReviewService service;



    /** 책 목록 표시 */
    @GetMapping("/allbook")
    public String allBook(Model model) {
        return null;
    }

    /** 사용자가 책 등록하는 목록 표시 */
    @PostMapping("/updatebook")
    public String updateBook(BindingResult bindingResult, Model model) {
        return null;
    }


    /** 책 리뷰 표시 */


}
