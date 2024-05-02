package lk.server.app;

import com.google.common.cache.Cache;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

@RestController
public class WebService {

    private final Cache<Long, IpInfo> cache;

    public WebService(@Qualifier("webCache") Cache<Long, IpInfo> cache) {
        this.cache = cache;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody IpInfo ipInfo){
        cache.put(System.nanoTime(), ipInfo);
        System.out.println(cache.asMap());
        return ResponseEntity.ok(null);
    }

//    @PostMapping
//    public ResponseEntity<Void> save(@RequestBody String ipInfo){
//        System.out.println("Data:" + ipInfo);
//        return ResponseEntity.ok(null);
//    }

    @GetMapping
    public ResponseEntity<Map<Long, IpInfo>> get(){
        ConcurrentMap<Long, IpInfo> map = cache.asMap();
        return ResponseEntity.ok(map);
    }

    @DeleteMapping
    public ResponseEntity<Void> clear(){
        cache.invalidateAll();
        return ResponseEntity.ok(null);
    }
}
