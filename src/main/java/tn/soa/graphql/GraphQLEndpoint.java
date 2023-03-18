package tn.soa.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import tn.soa.repository.StudentRepository;
@WebServlet(urlPatterns="/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {
	public GraphQLEndpoint() {
		super(buildSchema());
	}
	private static GraphQLSchema buildSchema() {
		StudentRepository studentRepository=new StudentRepository();
		return SchemaParser.newParser()
				.file("schema.graphqls")
				.build()
				.makeExecutableSchema();
	}

}
