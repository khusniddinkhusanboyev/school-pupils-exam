package uz.schoolpupilcomptest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import uz.schoolpupilcomptest.test.entity.Category;
import uz.schoolpupilcomptest.test.entity.Question;
import uz.schoolpupilcomptest.test.entity.SubCategory;
import uz.schoolpupilcomptest.test.service.CategoryService;
import uz.schoolpupilcomptest.test.service.QuestionService;
import uz.schoolpupilcomptest.test.service.SubCategoryService;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@ComponentScan("uz.schoolpupilcomptest")
@EnableJpaAuditing
@EntityScan(basePackages = "uz.schoolpupilcomptest")
@RequiredArgsConstructor
public class SchoolPupilCompTestApplication /*implements CommandLineRunner*/ {

	private final CategoryService categoryService;
	private final SubCategoryService subCategoryService;
	private final QuestionService questionService;
	public static void main(String[] args) {
		SpringApplication.run(SchoolPupilCompTestApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		categoryService.add(
				Category.builder()
						.id(5)
						.categoryImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwing.com%2Fen%2Fsearch%3Fq%3Dcomputer%2Bhardware&psig=AOvVaw04NerAzFnO4DI4pKaAhPIf&ust=1682960312697000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLCE2u-J0v4CFQAAAAAdAAAAABAE")
						.categoryName("pdp uz")
						.build());categoryService.add(
				Category.builder()
						.id(6)
						.categoryImage("https://brogrammers.uz/assets/images/edited.jpeg")
						.categoryName("Brogrammers")
						.build());

		subCategoryService.add(
				SubCategory.builder()
				.id(3)
						.subCategoryImage("https://brogrammers.uz/assets/images/one.jpeg")
						.title("brogrammers team")
						.description("the team which produce a bunch of projects")
						.categoryId(6)
						.build());

		questionService.save(Question.builder()
				.id(1)
				.question("Hisoblash tizimlari tarkibi quyidagi qismlardan iborat:")
				.image("https://www.google.com/url?sa=i&url=https%3A%2F%2Fmacresearch.org%2Fhow-to-use-apple-hardware-test-ath-on-your-mac%2F&psig=AOvVaw04NerAzFnO4DI4pKaAhPIf&ust=1682960312697000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLCE2u-J0v4CFQAAAAAdAAAAABAR")
				.optionA("apparat va dasturiy taʼminot")
				.optionC("qurilma va dasturlar")
				.optionD("qurilmalardan")
				.optionB("faqat dasturlardan")
				.categoryId(5)
				.choose(-1)
				.build());*/


}
