package com.game.puzzle.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/slide")
@RestController
public class SlideGameController extends GameController<SlideGameService> {


}