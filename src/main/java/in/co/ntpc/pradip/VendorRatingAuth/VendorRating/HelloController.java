package in.co.ntpc.pradip.VendorRatingAuth.VendorRating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class HelloController {
     @GetMapping("Admin")
     @ResponseBody
     @PreAuthorize("hasAuthority('APPROLE_Admin')")
     public String Admin() {
         return "Admin message";
     }
}
