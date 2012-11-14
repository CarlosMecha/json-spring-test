package org.carlosmecha.test.json;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     * 
     * @param locale
     * @param model
     * @return View.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(final Locale locale, final Model model) {
        logger.info("Welcome home! the client locale is " + locale.toString());

        final Date date = new Date();
        final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
            DateFormat.LONG, locale);

        final String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        model.addAttribute("newTest", new JSONTest());

        return "home";
    }

    /**
     * @param id
     * @param name
     * @param locale
     * @return JSON view.
     */
    @RequestMapping(value = "/json/{id}/{name}", method = RequestMethod.GET)
    public @ResponseBody
    JSONTest jsonHome(@PathVariable final Integer id, @PathVariable final String name,
            final Locale locale) {
        logger.info("Welcome JSON! the client locale is " + locale.toString());

        final Date date = new Date();
        final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
            DateFormat.LONG, locale);

        final String formattedDate = dateFormat.format(date);

        final JSONTest json = new JSONTest();
        json.setId(id.longValue());
        json.setName(name);
        json.setComment(formattedDate);

        return json;
    }

    /**
     * @param newTest
     * @param locale
     * @return {@code true} If it works! {@code false} otherwise.
     */
    @RequestMapping(value = "/json/new", method = RequestMethod.POST)
    public @ResponseBody
    Boolean jsonCreate(@RequestBody final JSONTest newTest, final Locale locale) {

        final Date date = new Date();
        final DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
            DateFormat.LONG, locale);

        final String formattedDate = dateFormat.format(date);

        logger.info("Created JSON object at " + formattedDate);
        logger.info("-- ID: " + newTest.getId());
        logger.info("-- Name: " + newTest.getName());
        logger.info("-- Comments: " + newTest.getComment());

        return true;
    }
}
