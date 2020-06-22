package org.wecancodeit.librarydemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.librarydemo.models.Actor;
import org.wecancodeit.librarydemo.models.Category;
import org.wecancodeit.librarydemo.models.Review;
import org.wecancodeit.librarydemo.repositories.ActorRepository;
import org.wecancodeit.librarydemo.repositories.ReviewRepository;
import org.wecancodeit.librarydemo.repositories.CategoryRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private CategoryRepository categoryRepo;

    @Resource
    private ActorRepository actorRepo;

    @Resource
    private ReviewRepository reviewRepo;

    @Override
    public void run(String... args) throws Exception {
        Category prequel = new Category("Prequel Trilogy");
        Category original = new Category("Original Trilogy");
        Category sequel = new Category("Sequel Trilogy");
        categoryRepo.save(prequel);
        categoryRepo.save(original);
        categoryRepo.save(sequel);

        Actor christensen = new Actor("Hayden", "Christensen");
        Actor liam = new Actor("Liam", "Neeson");
        Actor ewan = new Actor("Ewan", "McGregor");
        Actor natalie = new Actor("Natalie", "Portman");
        Actor mark = new Actor("Mark", "Hamill");
        Actor harrison = new Actor("Harrison", "Ford");
        Actor carrie = new Actor("Carrie", "Fisher");
        Actor driver = new Actor("Adam", "Driver");
        Actor daisy = new Actor("Daisy", "Ridley");
        Actor john = new Actor("John", "Boyega");
        actorRepo.save(christensen);
        actorRepo.save(liam);
        actorRepo.save(ewan);
        actorRepo.save(natalie);
        actorRepo.save(mark);
        actorRepo.save(harrison);
        actorRepo.save(carrie);
        actorRepo.save(driver);
        actorRepo.save(daisy);
        actorRepo.save(john);

        Review review = new Review( "Episode 1: A Phantom Menace", "../images/episode 1.jpg", prequel, "This is the start of the Skywalker saga and sets it all off. We don't even get to meet a Skywalker until Qui-Gon Jinn and Obi Wan Kenobi get to the planet of Tatooine. The movie starts with a political plot involving the two Jedi going to talks with the Trade Federation. This will set the overall theme and ideas of the first three movies. For being the overall all theme, it does not really add anything and seems to be needlessly convoluted. Anakin, who will become the villain of the later movies, is not a very compelling character in this movie. He becomes a literal Jesus figure with having no father and being born of the force as well as being told he is the 'Chosen One' who is meant to save the galaxy. One of the saving graces of this movie is the mysterious villain Darth Maul who does not speak and pursues the Jedi at the orders of his cloaked master who frequently appears to him in holograms. This even does not do much to add to the movie or themes as Maul meets his demise at the end of the movie at the hands of Obi Wan. This occurred after a duel between the two Jedi and the Sith where Maul killed Obi Wan's master. The music during this scene would become iconic and wonderful. Overall a forgettable movie that didn't really add much to the already established movies.", liam, ewan, natalie);
        Review review2 = new Review( "Episode 2: Attack of the Clones", "../images/episode 2.jpg", prequel, "The second of the Prequel Trilogy starts out a few years after Episode One. Anakin is older and is now Obi Wan's apprentice following the end of the previous movie. The political plot of this movie becomes bigger and more integral which distracts from what Star Wars is good at from times. After a failed assassination attempt on Padmes' life both Obi Wan and Anakin are charged with protecting her. Anakin takes her back to her planet of Naboo while Obi Wan follows a lead. While on Naboo Anakin professes his love for Padme which seems to come out of nowhere and is not well established. Obi wan's investigation takes him to Kamino where he finds that a huge clone army has been produced. Anakin then goes back to Tatooine after having visions and finds his mother dead. He then runs off to commit genocide on the Tusken Raiders. Obi Wan then travels to Genosis where he finds Count Dooku and is captured. Anakin and Padme follow him and find themselves captured as well. Dooku sentences the trio to death but they are saved by the Jedi Council and the clone army. A battle then ensues between Obi Wan, Anakin and Count Dooku. This sequel seems to not know what it wants to do and is in a hurry to establish backstory while having the politcal plot that it loses itself many times. Has some good moments but still a forgettable movie overall.", ewan, christensen, natalie);
        Review review3 = new Review( "Episode 3: Revenge of the Sith", "../images/episode 3.jpg", prequel, "This movie starts off a few years after the previes and more excitingly with a space dog fight over the planet Coruscant. Obi Wan and Anakin find themselves on Count Dooku and General Grievous' ship. After a brief battle between Dooku, Obi Wan, and Anakin, Anakin beheads Dooku at Emperor Palpatines urging which gives us a more personal look at Anakins descent into the dark side. After bringing down the ship Anakin is appointed to the Jedi Council by Palpatine. The Emperor then tells Anakin he can help Anakin save Padme. Anakin is able to deduce that Palpatine is Darth Sidious who has been a behind the scenes villain. Anakin informs the Jedi Council who then attempt to arrest the Emperor. Jedi Master Mace Windu has Palpatine on his back begging for his life when Anakin intervenes and saves Palpatine. This ultimately is the moment when Anakin has fallen to the dark side. He then assists Palpatine in killing the Jedi who are at the temple, even the children. Palpatine, meanwhile, enacts 'Order 66' which turns the clone army against the Jedi across the galaxy. The movie ends with Padme giving birth to twins and then dying and Obi Wan fighting Anakin on Mustafar in one of the best fight scenes in any of the Star Wars movies. This movie is the strongest of the prequel trilogy and brings a lot of the loose ends together going into what is the Original Trilogy.", ewan, christensen, natalie);
        Review review4 = new Review( "Episode 4: A New Hope", "../images/episode 4.jpg", original, "As the movie that started the whole Star Wars series that spans numerous movies, video games, books, comics, TV series etc. it is a wonderful space opera fantasy with hints of sci-fi. We are first introduced to the iconic characters of Luke Skywalker, Princess Leia, Han Solo, and Chewbacca. This movie follows Luke as he learns about the Jedi of old and how his father used to be a Jedi. He finds his adoptive family of his aunt and uncle have been killed by the Empire and thus he finds Han Solo who promises to get him off Tatooine. This finds them among the ruins of the recently destroyed planet of Alderaan and gets their ship captured by the nearby Empire space station known as the 'Death Star'. Princess Leia is aboard the Death Star awaiting her execution when Luke, Han, and Chewbacca save her. They make their way back aboard the ship with the iconic death of Obi Wan Kenobi. After they escape the Death Star they get back to the Rebellion with the Death Star plans and come up with a plan to destroy the station. This plan ultimately works when Luke hears Obi Wan telling him to 'Use the Force Luke' and he trusts the Force. This is a fantastic movie that really set off a phenomenon. It is not the best of the saga but is definitely in the top 3. ", mark, harrison, carrie);
        Review review5 = new Review( "Episode 5: The Empire Strikes Back", "../images/episode 5.jpg", original, "This is arguably the best movie of the entire saga. This entry begins three years after 'A New Hope' on the planet Hoth. The beginning of the movie starts with Han trying to leave and the Empire mounting an attack on the planet. Han is unable to leave before everything happens because he is growing as a character. Luke engages in the battle, bringing down the Empires' weapons with toy cables and his lightsaber. After the battle of Hoth, Luke goes to find Master Yoda while Han and everyone else go to Cloud City. The Empire is already at Cloud City and takes Han and company captive. Luke senses this and cuts his training short to go rescue his friends. Han gets frozen in carbonite before Luke is able to save them as the whole situation is a trap for Luke. Luke then confronts Darth Vader and eventually loses his hand. In a very iconic scene Darth Vader informs Luke that he is Lukes' father. Luke then falls but is saved by Leia who senses Luke. This entry ha a lot of character development and shows some of the struggles the heros have and that they are not always triumphant. It is an extremely important and powerful entry in the saga. It has everything that makes Star Wars what it is while also pushing things a little bit and subverting some of the expectations that were set after the first movie.", mark, harrison, carrie);
        Review review6 = new Review( "Episode 6: Return of the Jedi", "../images/episode 6.jpg", original, "The end of the Original Trilogy, the end of Luke Skywalkers original journey. This entry is good, it brings things to a close. It begins with Luke attempting to save Han and Leia but things go awry and they all get captured. Luke then goes back to Dagobah to finish his Jedi training with Yoda. The Rebels learn that a second Death Star is being made and has a shield generator on Endor. Luke goes to Vader to convince him to turn back to the Light Side while Han and company travel with the Rebels to take down the shield generator. The Emperor reveals to Luke that it is all a trap. Luke briefly gives into his hate and attempts to kill the Emperor but Vader intervenes. The two fight and Luke gains the upper hand. Instead of killing his father, Luke declares that he is a Jedi. The Emperor attempts to kill Luke with lightning but Vader steps in and throws the Emperor into the Death Star core. The Rebels manage to take down the shield and then destroy the second Death Star. This was the original end to the saga. It expanded on the second movie of the Original Trilogy but ultimately felt like a lot of things were forced, that they had to happen because it was an end. It is still a wonderful movie and definitely in the top 5 of the saga.", mark, harrison, carrie);
        Review review7 = new Review( "Episode 7: The Force Awakens", "../images/episode 7.jpg", sequel, "The movie re creates the nostalgia of the first original movies in the story wars saga while also creating a new set of characters. The movie has some spectacular visuals then I felt it could easily be compared to a new hope. Overall though the film was pleasurable and is a must see for the general audience.", driver, daisy, john);
        Review review8 = new Review( "Episode 8: The Last Jedi", "../images/episode 8.jpg", sequel, "Rather underwhelming, Star Wars: The Last Jedi is a solid sci-fi adventure, but it fails to build on the promise of The Force Awakens. After a costly attack on the First Order, the Resistance is depleted of resources and retreats to a fortified moon base for a last stand; meanwhile Ray pleads with a reluctant Luke Skywalker to train her to be a Jedi. None of the mysteries set up in the last film are followed through with or get satisfactory answers; Ray's parentage, Snoke's possible Jedi/Sith connection, Luke's battle with the Knights of Ren, etc. The script is poorly written and the characters don't feel the same. In fact, the directing and editing are so different that the film doesn't even feel connected to the previous ones. Still, most of the action scenes are exciting and the lightsaber fights are intense and dramatic. And the special effects are especially well-done, making for some visually compelling set and character designs. While Star Wars: The Last Jedi does''t live up to the standard that's been set by the new Star Wars films, it's entertaining and moves the saga forward (though not by much).", driver, daisy, john);
        Review review9 = new Review( "Episode 9: The Rise of Skywalker", "../images/episode 9.jpg", sequel, "Good Cinematography, CGI, Special Effects, Sound design, Score, and Performances. WORST screenplay ever filmed. Absolutely inept and embarrassing writing. Shockingly so. They didn't have a story to tell and it was obvious. It broke my heart because there are so many wonderful writers and directors with stories to tell, who understand the craft and who understand writing for characters instead of plot. Absolutely nonsensical plot from beginning to end, as if the script was a 2nd grade writing project. Every character was wasted because JJ and Chris Terrio had no interest in taking on the challenge. At least The Last Jedi dared to be a film with a coherent story. Characters constantly expositing plot is not a story, and it is unfathomable to me that these guys were allowed to write this screenplay. Zero craft.", driver, daisy, john);
        reviewRepo.save(review);
        reviewRepo.save(review2);
        reviewRepo.save(review3);
        reviewRepo.save(review4);
        reviewRepo.save(review5);
        reviewRepo.save(review6);
        reviewRepo.save(review7);
        reviewRepo.save(review8);
        reviewRepo.save(review9);


    }
}
