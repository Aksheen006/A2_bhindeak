package ca.sheridancollege.bhindeak.passwordstorebhindeak.controllers;

import ca.sheridancollege.bhindeak.passwordstorebhindeak.beans.PasswordRecord;
import ca.sheridancollege.bhindeak.passwordstorebhindeak.databases.DatabaseAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* Name: Aksheen Bhinder
student id : 991762812
 */

@Controller
public class HomeController {

    @Autowired
    private DatabaseAccess databaseAccess;

    // Home Page (Index)
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("passwordRecord", new PasswordRecord());
        return "index";
    }

    // Add Password Record
    @PostMapping("/add-record")
    public String addPasswordRecord(@ModelAttribute PasswordRecord passwordRecord, Model model) {
        databaseAccess.save(passwordRecord);
        model.addAttribute("message", "Record added successfully!");
        model.addAttribute("passwordRecord", new PasswordRecord());
        return "index";
    }




    // View All Password Records
    @GetMapping("/view-records")
    public String viewRecords(Model model) {
        List<PasswordRecord> records = databaseAccess.findAll();
        model.addAttribute("records", records);
        return "viewPasswordRecord";
    }

    // Search Password Record By Title
    @GetMapping("/search")
    public String searchPasswordRecord(@RequestParam(name = "title", required = false) String title, Model model) {
        List<PasswordRecord> records = databaseAccess.findByTitle(title);

        if (records == null || records.isEmpty()) {
            model.addAttribute("message", "No records found for: " + title);
        } else {
            model.addAttribute("records", records);
        }

        model.addAttribute("searchQuery", title);
        return "searchPasswordRecord";
    }
}
