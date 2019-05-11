package com.dd.demo.multiplemongo.repository.primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author dd
 */
@Data
@AllArgsConstructor//所有参数的构造器
@NoArgsConstructor//空构造器
@Document(collection = "first_mongo")
public class PrimaryModel {

	@Id//
	private String id;

	private String value;

	@Override
	public String toString() {
        return "PrimaryModel{" + "id='" + id + '\'' + ", value='" + value + '\''
				+ '}';
	}
}
