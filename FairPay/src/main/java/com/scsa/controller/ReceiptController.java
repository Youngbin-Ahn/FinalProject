package com.scsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scsa.model.service.ReceiptService;
import com.scsa.model.vo.ReceiptInfo;

@RestController
public class ReceiptController {

	private ReceiptService receiptService;

	@Autowired
	public void setReceiptService(ReceiptService receiptService) {
		this.receiptService = receiptService;
	}

	// û���� ������ ��ü ��� ��ȸ
	@RequestMapping(value = "/receipt_list.do")
	public String receipt_list_by_claimId(Model model, String claimId) {
		List<ReceiptInfo> list = receiptService.searchReceiptList(claimId);
		model.addAttribute("list", list);
		return "receipt_list";
	}

	// ������ ���
	@RequestMapping(value = "/add_receipt.do")
	public String add_receipt(Model model, ReceiptInfo receipt) {
		boolean result = receiptService.createReceipt(receipt);
		if (result) {
			model.addAttribute("msg", "������ ��Ͽ� �����Ͽ����ϴ�");
		} else {
			model.addAttribute("msg", "������ ��Ͽ� �����Ͽ����ϴ�");
		}
		return "receipt_list";
	}

	// ������ ����
	@RequestMapping(value = "/delete_receipt.do")
	public String delete_receipt(Model model, String receiptId) {
		boolean result = receiptService.removeReceipt(receiptId);
		if (result) {
			model.addAttribute("msg", "������ ������ �����Ͽ����ϴ�");
		} else {
			model.addAttribute("msg", "������ ������ �����Ͽ����ϴ�");
		}
		return "receipt_list";
	}

	// ������ �˻� by ���������̵�
	@RequestMapping(value = "/select_receipt.do")
	public String select_receipt(Model model, String receiptId) {
		model.addAttribute("list", receiptService.searchReceipt(receiptId));
		return "receipt_list";
	}
	
	
	// �����ؾ��� !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// ������ �ν� ( ������ �̹��� ��� )
	@RequestMapping(value = "/recog_receipt.do")
	public String recog_receipt(Model model, String receiptId) {
		return "receipt_list";
	}
}