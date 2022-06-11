package com.pvs.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/pv")
@RestController
public class DataPartiesController {
}
