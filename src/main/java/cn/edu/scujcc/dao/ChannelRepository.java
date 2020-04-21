
package cn.edu.scujcc.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import cn.edu.scujcc.module.Channel;

@Repository
public interface ChannelRepository extends MongoRepository<Channel,String>{

public List<Channel> findByTitleAndQuality(String t,String q);


public List<Channel> findByTitle(String title);


public List<Channel> findByQuality(String quality);
}

