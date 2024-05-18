package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.FamilyPlanPolicyBeneficiary;
import com.example.demo.entity.FamilyPlanPolicyHolder;
import com.example.demo.entity.IndividualPlanPolicyHolder;
import com.example.demo.entity.IndividualPolicyBeneficiary;
import com.example.demo.service.FamilyPlanPolicyHolderService;
import com.example.demo.service.IndividualPlanPolicyHolderService;
import com.example.demo.service.IndividualPolicyBeneficiaryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/policyholders")
public class IndividualPlanPolicyHolderController {

	@Autowired
	private IndividualPlanPolicyHolderService service;
   
	@Autowired
	private FamilyPlanPolicyHolderService famService;
	
	@Autowired
	
	private IndividualPolicyBeneficiaryService benService;
	@GetMapping
	public String index() {
		return "policyholders/index";
	}

	// Go to individual plan page
	@GetMapping("/individual-plan")
	public String individualPlanHome() {
		return "policyholders/individualPlan";
	}
	
	//Go to about page
	@GetMapping("/about")
	public String about() {
		return "policyholders/about";
	}
	
	//Go to the contact page
	@GetMapping("/contact")
	public String contact() {
		return "policyholders/contact";
	}

	

	
	
   //===================================================================CRUD Family ====================================
	/* Go to family plan page
		@GetMapping("/family-plan")
		public String familyPlanHome() {
			return "policyholders/familyPlan";
		}

	 @GetMapping("/list-famPolicy")
	    public String getAllPolicyHolders(Model model) {
	        List<FamilyPlanPolicyHolder> policyHolders = famService.getAllPolicyHolders();
	        model.addAttribute("policyHolders", policyHolders);
	        //add benefeciary objects here
	        return "policyHolders/list-famPolicy";
	    }
	
	
	
	@GetMapping("/addFamily")
	public String showAddFamPolicyHolderForm(Model model) {
		model.addAttribute("policyHolder", new FamilyPlanPolicyHolder());
		 model.addAttribute("beneficiary",new FamilyPlanPolicyBeneficiary());
		return "policyholders/family_plan_sign";
	}

	// Process form to add a new policyholder
	@PostMapping("/addFamily")
	public String addFamPolicyHolder(@ModelAttribute FamilyPlanPolicyHolder policyHolder) {
		famService.savePolicyHolder(policyHolder);
		return "policyholders/thank_you"; // add a success page
	}

	@GetMapping("/edit/{policyNumber}")
	public String editFamPolicyHolderForm(@PathVariable String policyNumber, Model model) {
		Optional<FamilyPlanPolicyHolder> policyHolder = famService.findById(policyNumber);
		model.addAttribute("policyHolder", policyHolder);
		return "policyHolders/family_plan_sign";
	}

	@GetMapping("/delete/{policyNumber}")
	public String deleteFamPolicyHolder(@PathVariable String policyNumber) {
		famService.deleteById(policyNumber);
		return "redirect:/policyHolders/family-plan";
	}
	*/

	 //======================================================================================================================
	// Log in page
	@GetMapping("/login")
	public String login() {
		return "policyholders/login";
	}
  
	// Login post
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model) {
		if ("admin".equals(username) && "admin".equals(password)) {
			// List all policyholders
			List<IndividualPlanPolicyHolder> policyHolders = service.getAllPolicyHolders();
		   List<IndividualPolicyBeneficiary> beneficiary = benService.getAll();
			model.addAttribute("IndividualPlanPolicyHolders", policyHolders);
		    model.addAttribute("IndidualPlanPolicyBeneficiaries",beneficiary);
			return "policyholders/list-policyholders";
		} else {
			List<IndividualPlanPolicyHolder> policyHolders = service.getAllPolicyHolders();
			for (IndividualPlanPolicyHolder i : policyHolders) {
				if (i.getEmail().equals(username) && i.getPassword().equals(password)) {
					model.addAttribute("user", i);
					model.addAttribute("beneficiary", i.getBeneficiary());

					return "policyholders/user_dashboard";
				}
			}
			model.addAttribute("error", "Invalid username or password");
			return "policyholders/login";
		}
	}
//======================================================================================================================
	// Show form to add a new policyholder
	@GetMapping("/add")
	public String showAddPolicyHolderForm(Model model) {
		model.addAttribute("policyHolder", new IndividualPlanPolicyHolder());
		model.addAttribute("beneficiary", new IndividualPolicyBeneficiary());
		return "policyholders/add-policyholder";
	}

	// Process form to add a new policyholder
	@PostMapping("/add")
	public String addPolicyHolder(@ModelAttribute IndividualPlanPolicyHolder policyHolder) {
		service.savePolicyHolder(policyHolder);
		return "policyholders/thank_you"; // add a success page
	}

	// Show form to edit an existing policyholder
	@GetMapping("/edit/{id}")
	public String showEditPolicyHolderForm(@PathVariable("id") String id, Model model) {
		Optional<IndividualPlanPolicyHolder> policyHolderOpt = service.getPolicyHolderById(id);
		if (policyHolderOpt.isPresent()) {
			model.addAttribute("individualPlanPolicyHolder", policyHolderOpt.get());
			return "policyholders/edit-policyholder";
		} else {
			return "redirect:/policyholders?error";
		}
	}

	@PostMapping("/edit/{id}")
	public String updatePolicyHolder(@PathVariable("id") String id,
	        @ModelAttribute IndividualPlanPolicyHolder policyHolder) {
	    policyHolder.setPolicyNumber(id);
	    service.savePolicyHolder(policyHolder);
	    return "redirect:/policyholders?success"; // Replace with the actual URL of the current page
	}

	// Delete a policyholder
	@GetMapping("/delete/{id}")
	public String deletePolicyHolder(@PathVariable("id") String id) {
	    service.deletePolicyHolder(id);
	    return "redirect:/policyholders?success"; // Replace with the actual URL of the current page
	}
	
	
	// Show form to edit an existing policyholder
		@GetMapping("/editBen/{id}")
		public String showEditBenPolicyHolderForm(@PathVariable("id") Long id, Model model) {
			Optional<IndividualPolicyBeneficiary> policyHolderOpt = benService.getById(id);
			if (policyHolderOpt.isPresent()) {
				model.addAttribute("individualPlanPolicyHolder", policyHolderOpt.get());
				return "policyholders/edit-policyholder";
			} else {
				return "redirect:/policyholders?error";
			}
		}
	
	
}
