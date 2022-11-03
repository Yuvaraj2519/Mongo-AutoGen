package com.mongo.app.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongo.app.entity.DbSequence;

@Service
public class SeqGeneratorServiceImpl implements SeqGeneratorService{
	
	@Autowired
	private MongoOperations mongo;
	
	@Override
	public int getSequenceNumber(String sequenceName) {
		
		Query query = new Query(Criteria.where("seqName").is(sequenceName));
		Update update = new Update().inc("seqNum", 1);
		
		DbSequence counter = mongo
				.findAndModify(query, 
						update,
						FindAndModifyOptions.options().upsert(true).returnNew(true),
						DbSequence.class);
		
		return !Objects.isNull(counter) ? counter.getSeqNum() : 1;
	}

}
