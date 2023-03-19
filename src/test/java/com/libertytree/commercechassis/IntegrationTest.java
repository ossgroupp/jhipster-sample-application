package com.libertytree.commercechassis;

import com.libertytree.commercechassis.JhipsterSampleApplicationApp;
import com.libertytree.commercechassis.config.AsyncSyncConfiguration;
import com.libertytree.commercechassis.config.EmbeddedElasticsearch;
import com.libertytree.commercechassis.config.EmbeddedKafka;
import com.libertytree.commercechassis.config.EmbeddedMongo;
import com.libertytree.commercechassis.config.EmbeddedRedis;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterSampleApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedMongo
@EmbeddedElasticsearch
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
