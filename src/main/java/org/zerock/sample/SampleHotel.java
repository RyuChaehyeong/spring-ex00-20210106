package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor //생성자 자동생성 (모든 필드에 대해 파라미터를 갖는 생성자 만듦)
@RequiredArgsConstructor //필수 필드만 파라미터로 갖는 생성자 만듦 (파라미터 없는 생성자) (@NonNull 붙은 것에 대해 파라미터 있는 생성자)
public class SampleHotel {
	
	@NonNull
	private Chef chef;
	
//	@Autowired가 없어도 자동으로 chef가 injection이 된다. 
/*	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
*/
}
