package com.mysite.sbb.item;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;

import com.mysite.sbb.itemImg.ItemImg;
import com.mysite.sbb.user.SiteUser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private SiteUser author;
	
	@Column
	private String itemName;
	
	@Column
	private String itemDetail;
	
	@Column
	private int price;
	
	@Column
	private int amount;
	
	@OneToMany(mappedBy="siteItem",cascade=CascadeType.REMOVE)
	private List<ItemImg> itemImgs; 
	
	@CreatedDate
    private LocalDateTime createDate;
	
	private LocalDateTime modifyDate;
	
	
	

}