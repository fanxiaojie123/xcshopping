package cn.axy.xc.xcitemdetailprovider.config;

import cn.axy.xc.xcitemdetailprovider.service.exit.Messageservicepojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
@Controller
public class UploadRest {

private static String UPLOADED_FOLDER = "/home/hadoop/images";

    @PostMapping("/upload") // //new annotation since 4.3
    @ResponseBody
     public String singleFileUpload(@RequestParam("photo") MultipartFile photo, RedirectAttributes redirectAttributes) {
        System.out.println(photo);

        if (photo.isEmpty()) {

            redirectAttributes.addFlashAttribute("message", "Please a file to upload");
            return "redirect:uploadStatus";
        }
        Messageservicepojo msp = new Messageservicepojo();
        String mPicture = "http://47.105.121.189/"+ photo.getName();
        msp.setmPicture(mPicture);
        try {
            // Get the file and save it somewhere
            byte[] bytes = photo.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + photo.getOriginalFilename());
            Files.write(path, bytes);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + photo.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "upload";
    }
}

