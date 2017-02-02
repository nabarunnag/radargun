package org.radargun.service;

import org.radargun.Service;
import org.radargun.config.Property;
import org.radargun.logging.Log;
import org.radargun.logging.LogFactory;
import org.radargun.traits.Clustered;
import org.radargun.traits.Lifecycle;
import org.radargun.traits.ProvidesTrait;
import org.radargun.traits.Transactional;

import java.util.Collection;
import java.util.List;

@Service(doc = "Geode")
public class GeodeService implements Lifecycle, Clustered{

  protected final Log log = LogFactory.getLog(getClass());


  @Override
  public void start() {

  }

  @Override
  public void stop() {

  }

  @Override
  public boolean isRunning() {
    return false;
  }

  @Override
  public boolean isCoordinator() {
    return false;
  }

  @Override
  public Collection<Member> getMembers() {
    return null;
  }

  @Override
  public List<Membership> getMembershipHistory() {
    return null;
  }
}