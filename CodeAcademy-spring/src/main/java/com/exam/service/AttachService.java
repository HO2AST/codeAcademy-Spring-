package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exam.domain.AttachVO;
import com.exam.mapper.AttachMapper;

@Service
@Transactional
public class AttachService {
	@Autowired
	private AttachMapper attachMapper;
	
	public List<AttachVO> getAttach(int bno) {
		return attachMapper.getAttach(bno);
	}
	
	public void insertAttach(AttachVO attachVO) {
		attachMapper.insertAttach(attachVO);
	}
	
	public void deleteAttachByBno(int num) {
		attachMapper.deleteAttachByBno(num);
	}
	
	public void deleteAttachByUuid(String uuid) {
		attachMapper.deleteAttachByUuid(uuid);
	}
	
	public List<String> getUuidAndFilenameByBno(int num) {
		return attachMapper.getUuidAndFilenameByBno(num);
	}
	
	public List<String> getUploadpathByBno(int num) {
		return attachMapper.getUploadpathByBno(num);
	}
}
