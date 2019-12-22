package com.ss.learn.java8.lambda.service;

import java.util.Optional;

import com.ss.learn.java8.lambda.domain.DisplayFeatures;
import com.ss.learn.java8.lambda.domain.Mobile;
import com.ss.learn.java8.lambda.domain.ScreenResolution;

public class MobileService {
	public Integer getMobileScreenWidth(Optional<Mobile> mobile) {
		return mobile.flatMap(Mobile::getDisplayFeatures).flatMap(DisplayFeatures::getResolution)
				.map(ScreenResolution::getWidth).orElse(0);

	}
}
