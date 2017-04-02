package edu.gandhi.prajit.april.step05.callback;

import java.text.MessageFormat;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class LifecyleListener {
	@PrePersist
	void prePersist(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:prePersist:{0}", object));
	}

	@PostPersist
	void postPersist(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:postPersist:{0}", object));

	}

	@PreUpdate
	void preUpdate(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:preUpdate:{0}", object));
	}

	@PostUpdate
	void postUpdate(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:postUpdate:{0}", object));
	}

	@PreRemove
	void preRemove(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:preRemove:{0}", object));
	}

	@PostRemove
	void postRemove(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:postRemove:{0}", object));
	}

	@PostLoad
	void postLoad(Object object) {
		System.out.println(MessageFormat.format(".LifecyleListener:postLoad:{0}", object));
	}
}